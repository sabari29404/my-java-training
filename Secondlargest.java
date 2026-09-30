package javaproblems;

public class Secondlargest {
	public static void main(String[] args) {
		int[] arr= {1,2,3,6,6,7,7,8,-1,100,4,5};
		int large=Integer.MIN_VALUE;
		int secLarge=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				secLarge=large;
				large=arr[i];
			}
			else if(arr[i]>secLarge&&arr[i]!=large) {
				secLarge=arr[i];
			}
		}
		//System.out.println("The largest number is: "+large);
		System.out.println("The second largest number is: "+secLarge);

	}

}
