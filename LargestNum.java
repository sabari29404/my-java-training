package javaproblems;

public class LargestNum {
	public static void main(String[] args) {
		
		int max=0;
		int arr[]= {1,2,3,4,6,100,5};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}
}
