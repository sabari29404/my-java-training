package javaproblems;

public class SmallestNum {
	public static void main(String[] args) {
		
		int min=Integer.MAX_VALUE;
		int arr[]= {1,2,3,4,-199,6,100,5};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println(min);
	}
}
