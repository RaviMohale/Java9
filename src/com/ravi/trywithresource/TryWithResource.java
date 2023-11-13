package com.ravi.trywithresource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TryWithResource {
	public static void main(String[] args) throws IOException {
		
		Test t = new Test();
		FileInputStream f = new FileInputStream("C:\\Users\\Ravi\\OneDrive\\Desktop\\Jshell");
		ObjectInputStream b = new ObjectInputStream(f);
		try(t;f;b){  // try with resource....
			
			b.readObject();
		}catch(Exception e){
			
		}
		
	}

}
