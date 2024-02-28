import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Test1 {

    static Exercise3 handle;

    @BeforeAll
    static void setup() {
        handle = new Exercise3();
    }

    @Test
    void extractURLTest1() {
        String text = "This \"No URL in this text\"is a website: https://www.shahidbeheshti.ir";
        String expected = "https://www.shahidbeheshti.ir";
        assertEquals(expected, handle.extractURL(text));
    }

    @Test
    void extractURLTest2() {
        String text = "This is a website: http://www.example.com";
        String expected = "http://www.example.com";
        assertEquals(expected, handle.extractURL(text));
    }

    @Test
    void extractURLTest3() {
        String text = "No URL in this text";
        assertNull(handle.extractURL(text));
    }

    @Test
    void extractURLTest4() {
        String text = "my website https://farid-karimi.github.io";
        String expected = "https://farid-karimi.github.io";
        assertEquals(expected, handle.extractURL(text));
    }

}