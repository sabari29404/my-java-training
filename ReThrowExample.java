package exception;
public class ReThrowExample {
    static void validateAge(int age) throws ArithmeticException {
        try {
            if (age < 18) {
            	ArithmeticException e=new ArithmeticException("underage");
                throw e;
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught inside validateAge: " + e.getMessage());
            throw new ArithmeticException("some issue"); // re-throwing
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught again in main: " + e.getMessage());
        }
    }
}
