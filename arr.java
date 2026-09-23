
import java.util.Scanner;

class arr{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Elements stored in the array:");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}