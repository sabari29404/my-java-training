public class odd {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("Even: "+i);
            }
            else{
                System.out.println("Odd: "+i);
                count++;
            }
        }
        System.out.println("odd counts: "+count);
    }
}
