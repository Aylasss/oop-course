package lesson01;
import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int targetNumber=random.nextInt(101);
        int guess;
        int[] guesses= new int[100];
        int guessCount=0;


        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();


        while (true){
            System.out.print("Enter your guess: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            guess=scanner.nextInt();
            guesses[guessCount]=guess;
            guessCount++;


            if (guess==targetNumber){
                System.out.println("Congratulations, " +name+"!");
                break;
            }

            else if (guess<targetNumber) {
                System.out.println("Your number is too small. Please, try again.");
            }

            else {
                System.out.println("Your number is too big. Please, try again.");
            }

        }


        //Bubble Sort:
        for(int i=0; i<guessCount-1; i++){
            for(int j=0; j<guessCount-i-1; j++)
            {
                if (guesses[j]<guesses[j+1]){
                    int temp=guesses[j];
                    guesses[j]=guesses[j+1];
                    guesses[j+1]=temp;
                }
            }
        }



        //Output guesses:

        System.out.print("Your numbers: ");
        for(int i=0; i<guessCount; i++){
            System.out.print(guesses[i]+" ");
        }



        scanner.close();

    }
}
