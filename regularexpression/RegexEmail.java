package regularexpression;

/*Create a regular expression that accepts alphanumeric characters only.  
Its length must be six characters long only.*/

import java.util.regex.Pattern;

public class RegexEmail {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun23"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2")); 
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
    }
}
