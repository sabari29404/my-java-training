import java.util.Scanner;
class sum{
    public static void main(String args[]) 
    {
        Scanner scan= new Scanner(System.in);
        String name= scan.nextLine();
        float mark= scan.nextInt();
        scan.nextLine();
        String course = scan.nextLine();
        System.out.println("My name is "+name );
        System.out.println("My score is "+mark/10+"/10" );
        System.out.println("My department is "+course );
    }
}