/******************************************************************************
 * Compilation: javac RegexProgram.java
 * Execution: java RegexProgram
 *
 * Reads in a string and prints out whether it matches the regular expression.
 *
 * % java RegexProgram
 *
 ******************************************************************************/
package regexprogram;

import java.util.regex.Pattern;

/**
 * The {@code RegexProgram} class represents a program that reads in a string
 * and prints out whether it matches the regular expression.
 *
 * @author eavelasquez
 */
public class RegexProgram {

    /**
     * Unit tests the {@code RegexProgram} data type.
     *
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        // A regular expression that matches a car plate number in Colombia.
        String regex1 = "^[A-Z]{3}[0-9]{3}$";

        // A regular expression that matches a fixed-line phone number in Medellin.
        String regex2 = "^[0-9]{3}-[0-9]{4}$";

        // A regular expression that matches a mobile phone number in Colombia.
        String regex3 = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";

        // A regular expression that matches email addresses.
        String regex4 = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";

        // A regular expression that matches the date format of the following format:
        // "dd/mm/yyyy" or "dd-mm-yyyy"
        String regex5 = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";

        // A regular expression that matches the time format of the following format:
        // "hh:mm:ss"
        String regex6 = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";

        // A regular expression that matches a variable declaration in Java.
        String regex7 = "^(int|double|float|char|String)\\s+[a-zA-Z_][a-zA-Z0-9_]*\\s*=\\s*[0-9]*\\.?[0-9]*$";

        // A regular expression that matches urls.
        String regex8 = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

        // A regular expression that matches full name (first and last name) in
        // Colombia, also allows `ñ` and `Ñ`.
        String regex9 = "^[A-Za-zÑñáéíóúÁÉÍÓÚ]+\\s[A-Za-zÑñáéíóúÁÉÍÓÚ]+$";

        // A regular expression that matches safe passwords.
        String regex10 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}$";

        // A regular expression that matches the double precision floating point number
        // format and the scientific notation format.
        String regex11 = "^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$";

        // A array of regular expressions.
        String[] regexes = { regex1, regex2, regex3, regex4, regex5, regex6, regex7, regex8, regex9, regex10,
                regex11 };

        // A array of regular expressions names.
        String[] regexNames = { "car plate number", "fixed-line phone number", "mobile phone number", "email",
                "date",
                "time", "variable declaration", "url", "full name", "password",
                "double precision floating point number" };

        // A array of array of valid regular expressions examples.
        String[] validRegexExamples = { "ABC123", "312-1234", "312-123-4598", "john@gmail.com", "01/01/2000",
                "12:00:00", "int x = 10;", "https://www.google.com", "John Doe", "q8W1gFr1%C+5)_y))Tfz",
                "1.23" };

        // A array of array of invalid regular expressions examples.
        String[] invalidRegexExamples = { "ABC123D", "3123-1234", "3123-12398", "   @gmail.com", "2000/01/01",
                "12-00-00", "int x = 10", "smtp://google.com", "JohnDoe", "12345678", "1.2.3" };

        // A array of regular expressions descriptions.
        String[] regexDescriptions = { "A car plate number in Colombia.",
                "A fixed-line phone number in Medellin.",
                "A mobile phone number in Colombia.", "An email address.",
                "A date in the format dd/mm/yyyy or dd-mm-yyyy.", "A time in the format hh:mm:ss.",
                "A variable declaration in Java.", "A url.", "A full name in Colombia.",
                "A password that must contain at least 8 characters, one uppercase letter, one lowercase letter, one number and one special character.",
                "A double precision floating point number." };
    }
}
