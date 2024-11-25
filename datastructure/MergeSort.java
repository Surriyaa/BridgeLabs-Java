package com.datastructure;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {8,5,9,1,6,7};
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		int l=0,r=arr.length-1;
		mergeSort(arr, l, r);
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}
	public static void mergeSort(int arr[],int l,int r){
		if(l<r) {
			int mid=(l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, mid, r);

		}
		
	}
	
	private static void merge(int[] arr, int l, int mid, int r) {
		int n1=mid - l + 1;
		int n2 = r - mid;
		int lArr[]=new int[n1];
		int rArr[]=new int[n2];
		
		for(int x=0;x<n1;x++) {
			lArr[x]=arr[l + x];
		}
		for(int y=0;y<n2;y++) {
			rArr[y]=arr[mid + 1 + y];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1 && j< n2) {
			if(lArr[i] <= rArr[j]) {
				arr[k]=lArr[i];
				i++;
			}
			else {
				arr[k]=rArr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=lArr[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k]=rArr[j];
			j++;
			k++;
		}
		
	}
	

}
