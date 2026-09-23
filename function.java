public class function {
    int price=20;
    int count=5;
    void total(){
        System.out.println("The total cost: "+price*count);
    }
    public static void main(String[] args) {
        function obj1=new function();
        obj1.total();
    }
}
