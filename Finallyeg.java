package exception;

public class Finallyeg {
	 public static void main(String[] args) {
	        try {
	            int x = 5 / 1;
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught");
	        } finally {
	            System.out.println("This always executes");
	        }
	    }
}
