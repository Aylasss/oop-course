package lesson13.task1;

import java.util.Scanner;


//creating interface
interface PerformOperation {
    public boolean check(int num); // Added 'public' here
}


public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int condition = scanner.nextInt();
            int number = scanner.nextInt();

            String output;

            if (condition == 1) {
                output = isOdd().check(number) ? "ODD" : "EVEN";
            } else if (condition == 2) {
                output = isPrime().check(number) ? "PRIME" : "COMPOSITE";
            } else if (condition == 3) {
                output = isPalindrome().check(number) ? "PALINDROME": "NOT PALINDROME";
            } else {
                output = "INVALID CONDITION";
            }

            System.out.println(output);
        }
        scanner.close();



}
    //methods:
    public static PerformOperation isOdd() {
        return num-> num % 2 != 0;

    }


    public static PerformOperation isPrime() {
        return num -> {
            if (num < 2) return false;

            for (int i = 2; i * i <= num; i++) {
                if (num % i== 0) return false;
            }
            return true;
        };

    }

    public static PerformOperation isPalindrome() {
        return num -> {
            String str = Integer.toString(num);
            String reversed = new StringBuilder(str).reverse().toString();

            return str.equals(reversed);
        };

    }


}