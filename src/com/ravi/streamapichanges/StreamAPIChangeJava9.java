package com.ravi.streamapichanges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIChangeJava9 {
	public static void main(String[] args) {
		
	
	List<Integer> l = new ArrayList<Integer>();
	
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	l.add(9);
	l.add(2);
	l.add(7);
	l.add(100);
	l.add(200);
	l.add(80);
	l.add(220);
	
	/*
	 * 	  takeWhile is same as limit 
	 * 	  dropWhile is same as skip
	 */
	
	// filter will filter all the record present in the  Collection
	// filter will execute throughout the collection object or array object...
	l.stream().filter(p -> p%2 == 0).forEach(p -> System.out.println("  using filter...."+p));
	
	// take will is same as limit...
	// in takeWhile ,whenever the 1st occurrence is failed it will ignore rest of the data..
	// takeWhile will filter the record until condition is true , if the  condition false it will stop further filter the record 
	System.out.println("using takeWhile ----");
	l.stream().takeWhile(p -> p%2 == 0).forEach(p -> System.out.println(+p));
	
	// dropwhile is same as skip
	// dropwhile will drop till the condition is true... if the condition is true it will give to next operator..
	System.out.println("using dropWhile ----");
	l.stream().dropWhile(p -> p%2 == 0).forEach(p -> System.out.println(+p));
	
	//write a program for below output
	
	//1
	//10
	//100
	//1000
	//10000
	System.out.println(" program for multiple of 10..");
	for(int i = 1 ; i <= 10000 ; i = i*10) {
		
		int k = 1000;
		int z = 400;
		System.out.println(i);
	}
	System.out.println(" using the stream iterate ");
	Stream.iterate(1, i ->  i <= 10000, i -> i *10).forEach(p -> System.out.println(p));
	
	// other way......
	Stream.iterate(1, i ->  i <= 10000, i -> i *10).forEach(p -> {
		System.out.println(p);
		int j = 100;
		int y = 200;
	});
	
	Stream<List<Integer>> st = Stream.ofNullable(l);
	System.out.println(st);
	
	
	List<String>monthList = new ArrayList<String>();
	monthList.add("JAN");monthList.add("Feb");monthList.add("March");
	monthList.add("April");monthList.add("May");monthList.add("June");
	monthList.add("July");monthList.add("Aug");monthList.add("Sep");
	monthList.add("Oct");monthList.add("Nov");monthList.add("Dec");
	
	
	
	try {
		monthList= Collections.unmodifiableList(monthList);
		monthList.remove("JAN");
	}catch(Exception e) {
	
	}System.out.println(monthList);
	
	List<String> mon = List.of("Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec");
	mon.remove("Jan");
	System.out.println(mon);
	}
	
}
