package com.datastructure;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {5,7,9,1,14,2,55,44,210};
		int n=arr.length;
		int minInd=-1;
		int temp=0;
		
		for(int i=0;i<n-1;i++) {
			minInd=i;
			for(int j=i+1;j<n;j++) {
				if(arr[minInd] > arr[j]) 
					minInd=j;
				
				//System.out.println(arr[minInd]);
				
			}
			temp=arr[minInd];
			arr[minInd]=arr[i];
			arr[i]=temp;
		}
		for  (int a:arr) {
			System.out.print(a+" ");
		}
	}

}
