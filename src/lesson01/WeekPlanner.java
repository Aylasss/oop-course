package lesson01;
import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args)
    {
        String[][] schedule =  new String[7][2];

        schedule[0][0]="Sunday";
        schedule[0][1]="do homework";

        schedule[1][0]="Monday";
        schedule[1][1]="go to courses, watch a film";

        schedule[2][0]="Tuesday";
        schedule[2][1]="work on project";

        schedule[3][0]="Wednesday";
        schedule[3][1]="gym";

        schedule[4][0]="Thursday";
        schedule[4][1]="revision";

        schedule[5][0]="Friday";
        schedule[5][1]="do java";

        schedule[6][0]="Saturday";
        schedule[6][1]="just relax";


        Scanner scanner = new Scanner(System.in);
        String weekDay;



        while(true){
            System.out.print("Please, enter the day of the week: ");
            weekDay=scanner.nextLine();

            if (weekDay.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }


            boolean found=false;

            //searching for the day:

            for (int i =0; i<7; i++){
                    if(schedule[i][0].equalsIgnoreCase(weekDay)){
                        System.out.println("Your tasks for "+weekDay+": "+ schedule[i][1]);
                        found=true;
                        break;
                    }
                }

            if (!found) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }

        }



    }
}
