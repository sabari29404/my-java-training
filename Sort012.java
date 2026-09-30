package javaproblems;

public class Sort012 {

	public static void main(String[] args) {
		
		int[] arr= {2,0,1};
		int left=-1;
		int right=arr.length;
		int mid=0;
		
		while(mid<right) {
			int temp=0;
			if(arr[mid]==0) {
				left++;
//				arr[left]=0;
				temp=arr[mid];
				arr[mid]=arr[left];
				arr[left]=temp;
				mid++;
			}
			else if(arr[mid]==2) {
				right--;
//				arr[right]=2;
				temp=arr[mid];
				arr[mid]=arr[right];
				arr[right]=temp;
				mid++;
			}
			else {
				mid++;
			}		
		}
//		for(int i=left+1;i<right;i++) {
//			arr[i]=1;
//		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
