import java.util.regex.*;

public class EmailTest {
    static String emailRegex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";


    public static void main(String[] args) {
        String[] emails={
            "abc@yahoo.com",        
            "abc-100@yahoo.com",     
            "abc.100@yahoo.com",     
            "abc111@abc.com",        
            "abc-100@abc.net",       
            "abc.100@abc.com.au",    
            "abc@1.com",            
            "abc@gmail.com.com",     
            "abc+100@gmail.com",     
            "abc@.com.my",           
            "abc123@gmail.a",        
            "abc123@.com",           
            "abc123@.com.com",       
            "abc()*@gmail.com",      
            "abc@%*.com",            
            "abc..2002@gmail.com",   
            "abc.@gmail.com",        
            "abc@abc@gmail.com",     
            "abc@gmail.com.1a",      
            "abc@gmail.com.au.au"    
            };

        for (String email : emails) {
            System.out.println("Is the email " + email + " valid? " + isValidEmail(email));
        }
    }

    private static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
