
import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ip1= scan.nextInt();
        int ip2= scan.nextInt();
        String res=ip1<ip2?"2nd input is greater":"1st is greater";
        System.out.println(res);
    }
}
