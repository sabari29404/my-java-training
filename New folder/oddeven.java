public class oddeven {
    void evenorodd(int num){
        if(num%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("0DD");
        }
    }

    public static void main(String[] args) {
        oddeven obj=new oddeven();
        obj.evenorodd(7);
    }
}
