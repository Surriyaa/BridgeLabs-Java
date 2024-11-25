package com.datastructure;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {10,4,8,22,1,66};
		int n=arr.length;
		
		for(int i=1;i<n;i++) {
			int j=i-1;
			int key=arr[i];
			
			while(j>=0 && arr[j] > key) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=key;
			for(int num:arr) {
				System.out.print(num+ " ");
			}
			System.out.println();
		}
		for(int num:arr) {
			System.out.print(num+ " ");
		}
	}

}
