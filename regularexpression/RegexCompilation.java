package regularexpression;

import java.util.regex.*;

public class RegexCompilation {
    public static void main(String[] args) {
        Pattern p=Pattern.compile(".s");
        Matcher m=p.matcher("as");
        boolean b1=m.matches();

        boolean b2=Pattern.compile(".s").matcher("as").matches();

        boolean b3 = Pattern.matches(".s", "as"); 
        
        System.out.println(b1+" "+b2+" "+b3);
    }
}
