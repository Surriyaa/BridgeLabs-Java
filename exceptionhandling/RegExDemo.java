package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("C:\\Users\\ASUS\\Desktop\\test.txt");
		Scanner sc=new Scanner(file);
		boolean present=sc.hasNext();
		//System.out.println(44);
		while(present) {
			String word=sc.next();
			int ind=word.lastIndexOf(":");
			String mob=word.substring(ind+1);
			Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
			Matcher m=p.matcher(mob);
			if(m.find())
				System.out.println(m.group()+" is a valid Mobile Number ");
			else
				System.out.println(mob+" is a invalid Mobile Number");
			present =sc.hasNext();
		}
		

	}

}
