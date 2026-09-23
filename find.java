
import java.util.Scanner;

public class find {
   String evenorodd(int x){
    if(x%2==0){
        return "Even";
    }
    else{
        return "odd";
    }
   } 
   public static void main(String[] args) {
    find obj=new find();
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    String z=obj.evenorodd(x);
    System.out.println(z);
   }
}
