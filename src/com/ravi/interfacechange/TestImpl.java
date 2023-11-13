package com.ravi.interfacechange;

public class TestImpl  implements InterfaceChange {

	
	// overriding the abstract method
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" %%%%%%%%    abstract method display called........");
	}
	
	
	public static void main(String[] args) {
		  
		TestImpl t = new TestImpl();
		t.check1(); // calling default method
		InterfaceChange.check2(); // calling static method
		t.display();  // calling abstract method..
		
		
	}
}
