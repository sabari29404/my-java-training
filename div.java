
import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("given number can be divisible by 3 and 5");
        }
        else{
            System.out.println("given number cannot be divisible by 3 and 5");
        }
    }
}
