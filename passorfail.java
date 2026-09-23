
import java.util.Scanner;

public class passorfail {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int mark= scan.nextInt();
        if(mark<35){
            System.out.println("u r fail");
        }
        else{
            System.out.println("u r pass");
        }
    }
    
}
