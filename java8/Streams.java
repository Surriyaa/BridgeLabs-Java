package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.*;
public class Streams {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(4);nums.add(9);nums.add(3);
		nums.add(1);nums.add(8);nums.add(5);nums.add(7);
		
		//nums.forEach(i-> System.out.println(i));
		//Stream <Integer> s1=nums.stream();
		
		//s1.forEach(System.out::println);//same as above using :: 
		//markker interface
		
//		int res=nums.stream()
//				.filter(n->n>3) 
//				.map(n->n*2)
//				.reduce(0,(c,e)->c+e);
//		System.out.println(res);
		
		Stream <Integer> s2=nums.parallelStream()
				.filter(n->!(n%2==0))
				.sorted();
		s2.forEach(n->System.out.println(n));
	}
		
}
