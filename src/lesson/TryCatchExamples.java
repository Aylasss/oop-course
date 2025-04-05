package lesson;

    class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class TryCatchExamples {
    public static void main(String[] args) {

        //Task1
    /*System.out.println("Task 1: Simple try-catch example");
    try{
        int[] nums = new int[3];
        System.out.println(nums[4]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("caught ArrayIndexOutOfBoundsException!");
    }*/


        //Task2
    /*System.out.println("Task 2: Different Exceptions");
    try{
        int[] nums = new int[3];
        System.out.println(nums[5]);
        System.out.println(10/0);
    }

    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("caught ArrayIndexOutOfBoundsException!");
    }

    catch (ArithmeticException e){
        System.out.println("caught ArithmeticException!");
    }*/


        //Task3
    /*System.out.println("Task3: StackOverflowError");
    try{
        recursiveMethod(0);
    }
    catch (StackOverflowError e){
        System.out.println("Caught StackOverflowError!");
    }*/


        //Task4
    /*System.out.println("Task 4: OutOfMemoryError");
    try{
        int[] array = new int[Integer.MAX_VALUE];
    }
    catch (OutOfMemoryError e){
        System.out.println("Caught OutOfMemoryError!");
        }

     */


        //Task5
        System.out.println("Task 5: User Defined Exception");
        double accountBalance = 189.4;
        double paymentAmount = 237.0;

        try {
            if (accountBalance < paymentAmount) {
                throw new InsufficientFundsException("Insufficient funds!");
            }
            accountBalance -= paymentAmount;
            System.out.println("Payment processed. New balance: " + accountBalance);
        } catch (InsufficientFundsException e) {
            System.out.println("Failed");
        }
    }


    private static void recursiveMethod(int x) {
        recursiveMethod(x+1);
    }


}
