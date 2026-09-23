
import java.util.Scanner;

public class name {
    long getphone(long x){
        return x;
    }
    public static void main(String[] args) {
        name obj = new name();
        Scanner scan = new Scanner(System.in);
        long ph=scan.nextInt();
        long show=obj.getphone(ph);
        System.out.println(show);
    }
}
