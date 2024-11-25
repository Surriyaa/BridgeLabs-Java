package com.java;
import java.util.*;
public class BinarySearch {
	class Graph{
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int [n];
		int target=sc.nextInt();
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		int result=binarySearch(n,nums,target);
		if(result!=-1) {
		System.out.println("Target is found: "+ result);}
		else {
			System.out.println("No such element found");
		}
	}
	
	public static int binarySearch(int n,int[] nums,int target) {
		int left =0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;

			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				left = mid+1;
			}
			else {
				right =mid-1;
			}
		}
		
		return -1;
	}

}
