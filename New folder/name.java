import java.util.Scanner;
public class name {
    String getname(String a){
        return a;
    }
    int getno(int b){
        return b;

    }
    public static void main(String[] args) {
        name obj=new name();
        Scanner get=new Scanner(System.in);
        String store=get.nextLine();
        String c= obj.getname(store);
        int store2=get.nextInt();
        int d=obj.getno(store2);
        System.out.println(c);
        System.out.println(d);

    }
}
