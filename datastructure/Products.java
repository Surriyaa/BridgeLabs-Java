package com.java;
import java.util.*;
public class Products {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		int maxProduct=arr[arr.length-1]*arr[arr.length-2];
		System.out.println(arr[1]);
		System.out.println("Maximum product is :"+maxProduct);
	}

}
