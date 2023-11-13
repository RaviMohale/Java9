package com.ravi.interfacechange;

public interface InterfaceChange {
	
	/*
	 * from java 9 you can write private method default method static method
	 */

		public  void display();  // abstract method
		
		default  void check1() {
			validate1();//   calling the private instance method 
			reusableCode();// calling the private static method
			System.out.println("!!!!!   default check1() method in InterfaceChange");
			
		}
		
		
		
		
		static void check2() {
			//from static we can not call instance method
		
			reusableCode(); // calling the private static  method...
			System.out.println("=========static  check2() .. method in InterfaceChange");
		}
		
		
		
		// from java 9 we can write the private  method.....
		// we can not override private method
		
		// private method can be instance or default
		private void validate1() {
			System.out.println(" -------   private instance validate1() method in InterfaceChange");
		}
		
		private static void reusableCode() {
			System.out.println(" *****   private static reusableCode() method in InterfaceChange");
		}	
}
