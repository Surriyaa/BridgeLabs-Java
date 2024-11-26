	package java8;
	
	
//	class A implements Runnable
//	{
//		public void run() {
//			for(int i=0;i<=5;i++) {
//				System.out.println("Surriyaa..");
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) { e.printStackTrace();
//				}
//			}
//			
//		}
//	}
//
//	class B implements Runnable{
//		public void run() {
//			for(int i=0;i<=5;i++) {
//				System.out.println("Gold");
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {	e.printStackTrace();
//				}
//			}
//		}
//	}
	
	public class MultiThread {
	
		public static void main(String[] args) {
			Runnable obj1=() -> { //using lambda Expression
					for(int i=0;i<=5;i++) {
						System.out.println("Surriyaa..");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) { e.printStackTrace();
					}
				}
			};
			 
			Runnable obj2=()-> {
					for(int i=0;i<=5;i++) {
						System.out.println("Gold..");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) { e.printStackTrace();
					}
				}
							
			};
			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj2);
			
			t1.start();
			t2.start();
		}
	
	}
