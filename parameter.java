public class parameter {
    void add(int x, int y){
        System.out.println(x+y);
    }
    void sub(int x, int y){
        System.out.println(x-y);
    }
    void mul(int x, int y){
        System.out.println(x*y);
    }
    void div(int x, int y){
        System.out.println(x/y);
    }
    public static void main(String[] args) {
        parameter obj=new parameter();
        obj.add(5,3);
        obj.sub(5,3);
        obj.mul(5,3);
        obj.div(5,3);
    }
}
