import java.util.Scanner;
import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter a Regex pattern");
            Pattern p=Pattern.compile(sc.nextLine());
            System.out.println("Enter a text");
            Matcher m=p.matcher(sc.nextLine());
            boolean found=false;
            while (m.find()) {
                System.out.println("I found the text "+m.group()+" starting at the index "+m.start()+" and ending at the index "+m.end());
                found=true;
            }
            if (!found) {
                System.out.println("No match found");
            }
        }
    }
}
