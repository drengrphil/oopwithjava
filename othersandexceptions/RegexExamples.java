import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Pattern Class - Defines a pattern (to be used in a search)
// Matcher Class - Used to search for the pattern
// PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

public class RegexExamples {
    // Regular expression
    public static void main(String[] args) {
        Pattern patternToSearch = Pattern.compile("my mother", Pattern.CASE_INSENSITIVE);
        Matcher matcher = patternToSearch.matcher("I love my mother");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }

        // Other expression matching pattern
        // [abc] : find one character from the option in the bracket
        // [^abc] : find one character not between the bracket
        // [0-9] : Find one character within range 0 to 9
    }
}
