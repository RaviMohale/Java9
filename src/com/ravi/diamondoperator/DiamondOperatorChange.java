package com.ravi.diamondoperator;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorChange {
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>(); // since 1.5 you have to write generic (Integer type) in both the side
		List<Integer> l1 = new ArrayList<>(); // since 1.7 you have to write the generic (integer) type in one side
		// Note for the Anonymous inner class you have to write the generic in both the side  till java 1.8
		// but from java 1.9 you have to write the generic in one side for Anonymous inner class
		DiamondOperator<Integer> d = new DiamondOperator<Integer>() {
			
			@Override
			Integer add(Integer num1, Integer num2) {
				
				return Integer.valueOf(num1.intValue()+ num2.intValue());
			}
		};
		System.out.println(d.add(20, 25));
	}

}
