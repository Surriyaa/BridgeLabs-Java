package com.ExceptionHandling;

import java.util.Scanner;

class Demo{
	
	void alpha() throws Exception{
		System.out.println("start 2");
		try {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Handled in alpha");
			throw e;
		}
		finally {
		System.out.println("End 2");
		}
	}
	
}
public class Launch {

	public static void main(String[] args) {
		try {
			Demo d=new Demo();
			d.alpha();
		}
		catch(Exception e) {
			System.out.println("Handled in main");
		}
	}

}
