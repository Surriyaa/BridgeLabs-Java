/*Create a regular expression that accepts 10 digit numeric characters 
 starting with 7, 8 or 9 only.*/

import java.util.regex.Pattern;

public class PhoneRegex {
    public static void main(String[] args) {
        System.out.println("---By character class and quantifier---");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "8867658481"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "99530389490"));  
        System.out.println(Pattern.matches("[789][0-9]{9}", "7753038949"));

        System.out.println("---By character class and meta characters---");
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8867658481"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "4867658481"));
    }
}
