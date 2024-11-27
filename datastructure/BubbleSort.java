package datastructure;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {10,4,7,2,5,13,1};
		int n=arr.length;
		int temp=0;
		
		for(int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if(arr[i] > arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			for(int a:arr) {
				System.out.print(a+ " ");
			}
			System.out.println();
		}
		for(int a:arr) {
			System.out.print(a+ " ");
		}
	}

}
