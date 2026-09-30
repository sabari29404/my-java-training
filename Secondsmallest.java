package javaproblems;

public class Secondsmallest {
	public static void main(String[] args) {
		int[] arr= {1,2,3,6,6,7,7,8,-1,100,4,5,0};
		int small=Integer.MAX_VALUE;
		int secSmall=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				secSmall=small;
				small=arr[i];
			}
			else if(arr[i]<secSmall&&arr[i]!=small) {
				secSmall=arr[i];
			}
		}
		//System.out.println("The largest number is: "+large);
		System.out.println("The second largest number is: "+secSmall);

	}

}
