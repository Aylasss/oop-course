package lesson12;
import java.util.Arrays;
import java.util.Scanner;

public class PlayerApp {
    public static void main(String[] args) {

        //input:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of players:");
        int n = scanner.nextInt();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            players[i] = new Player(name, score);
        }

        //process:

        ComparatorApp checker = new ComparatorApp();

        Arrays.sort(players, checker);

        //output:

        for (int i = 0; i < n; i++) {
            System.out.println(players[i].name + " " + players[i].score);
        }

        scanner.close();

    }
}