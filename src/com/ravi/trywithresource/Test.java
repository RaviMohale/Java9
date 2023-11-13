package com.ravi.trywithresource;

public class Test  implements AutoCloseable{
	
	public void close() {
		System.out.println("test class close method is executed........");
	}

}
