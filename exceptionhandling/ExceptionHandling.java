package exceptionhandling;
import java.util.*;	

	class Alpha{
		
		void add() {
			try {
				System.out.println("start 4");
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a/b);
				int i=sc.nextInt();
				int arr[]=new int[i];
				int index=sc.nextInt();
				int data=sc.nextInt();
				arr[index]=data;
				System.out.println("End 4");
				sc.close();
			}
			catch(ArithmeticException ae) {
				System.out.println(ae+"Give non zero input");
			}
			catch (NullPointerException ne) {
				System.out.println(ne+"Null cannot be correct");
			}
			catch (ArrayIndexOutOfBoundsException ie) {
				System.out.println(ie+" Cant access the array");
			}
			catch(InputMismatchException ie) {
				System.out.println(ie+"Give teh correct variable type");
			}
			catch(Exception e) {
				System.out.println(e+" You have not handled it");
			}
			
		}	
	}
	
	class Beta{
		void add() {
			System.out.println("s3");
			Alpha a=new Alpha();
			a.add();
			System.out.println("end 3");
		}
	}
	
	class Gamma{
		
		void add() {
			System.out.println("s2");
			Beta b=new Beta();
			b.add();
			System.out.println("end 2");
		}
	}
	
	public class ExceptionHandling {

		public static void main(String[] args) {
			System.out.println("start 1");
			Gamma g=new Gamma();
			g.add();
			System.out.println("End 1");

		}
	
	}
