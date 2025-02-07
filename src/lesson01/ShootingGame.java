package lesson01;
import java.util.Random;
import java.util.Scanner;


public class ShootingGame {
    public static void main(String[] args)
    {
        Random random=new Random();
        Scanner scanner= new Scanner(System.in);

        final int SIZE=5;
        char[][] grid = new char[SIZE][SIZE];
        int targetRow=random.nextInt(SIZE);
        int targetCol= random.nextInt(SIZE);


        //user's guesses:
        int row;
        int col;


        //Initial grid:
        for(int i=0; i<SIZE; i++)
        {
            for(int j=0; j<SIZE; j++)
            {
                grid[i][j]='-';
            }
        }


        System.out.println("All set. Get ready to rumble!");

        while(true){
            System.out.print("Enter row: ");
            row=scanner.nextInt();
            System.out.print("Enter column: ");
            col=scanner.nextInt();

            if (row-1==targetRow && col-1==targetCol){
                grid[row-1][col-1]='x';
                printGrid(grid);
                System.out.println("You have won!");
                break;
            }

            else{
                grid[row-1][col-1]='*';
                System.out.println("Missed. Try again.");
            }

            printGrid(grid);
        }

        scanner.close();






    }
    //Method to print the grid:

    private static void printGrid(char[][] grid){
        System.out.println("  1 2 3 4 5");
        for (int i=0; i<grid.length; i++){
            System.out.print((i+1)+" ");
            for (int j= 0; j<grid[i].length; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

}
