package com.collections;
import java.util.*;
public class MaxofArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> listi=new ArrayList<Integer>();
		Collections.addAll(listi, 10, 20, 30, 40, 50);
		
		ArrayList<Double> listd=new ArrayList<Double>();
		Collections.addAll(listd, 2.3,5.5,22.1,77.2,10.2);
		
		ArrayList<Long> listl=new ArrayList<Long>();
		Collections.addAll(listl, 5454545l,884454l,5545545l,1545856l,5488715l);
		
		maxInt(listi);
		maxDouble(listd);
		maxLong(listl);
		
		
	}

	private static void maxInt(ArrayList<Integer> listi) {
		Integer max=0;
		for(int a:listi) {
			if(a>max)
				max=a;
		}
		System.out.println(max+" is the maximum element in the Integer list");
	}
	
	private static void maxDouble(ArrayList<Double>  listd) {
		Double max=0.0;
		for(double a:listd) {
			if(a>max)
				max=a;
		}
		System.out.println(max+" is the maximum element in the Double list");
	}
	
	private static void maxLong(ArrayList<Long> listl) {
		Long max=0l;
		for(long a:listl) {
			if(a>max)
				max=a;
		}
		System.out.println(max+" is the maximum element in the Long list");

	}

	

}
