package com.java8;


	@FunctionalInterface
	interface S{
		void surriyaa();
	}
	interface G{
		void gold(String s);
	}
	public class FunctionalInterfacedemo {
	
		public static void main(String[] args) {
			S obj=new S() {//functional interface
				public void surriyaa() {
					System.out.println("Surriyaa is a Functional interface");
				}	
			};
			//lambda expression -> ----can reduce code...
			G obj2=s -> System.out.println("Gold has "+s);
			obj.surriyaa();;;;;
			obj2.gold("Surriyaa");
			
		}
	
	}
