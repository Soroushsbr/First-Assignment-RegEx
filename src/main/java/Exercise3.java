import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    /*
    implement the method below so that it extracts a URL from a String
    I will write the basics for this one method, you will have to implement the other two methods from scratch
    */

    public static String extractURL(String text) {
        String Regex = "(http|https)://[^\\s]*";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            return (matcher.group());
        }
        else
            return null;
    }


    /*
    implement the method below to validate an email address
     */

    public static boolean validateEmail(String email) {
        String regex = "[^\\s]*@[^\\s]*.[^\\s]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    /*
    implement the method below so that it returns a list of words with repeated letters
    */

    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeat = new ArrayList<>();
        String regex = "\\w*(\\w)\\w*\\1\\w*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            wordsWithRepeat.add(matcher.group());
        }
        return wordsWithRepeat;
    }

    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        String regex = "(\\w{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            repeatedWords.add(matcher.group());
        }
        return repeatedWords;
    }

    public static void main(String[] args) {
        // test your code here!
    }
}