
import java.util.Scanner;

public class mid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size= scan.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < size; i++) {
            arr[i]=scan.nextInt();
        }
        int mid=size/2;
        System.out.println("Middle element in an array: "+arr[mid]);
    }
}
