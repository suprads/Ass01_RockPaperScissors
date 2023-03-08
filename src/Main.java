import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playA = "";
        String playB = "";
        String trash = "";
        boolean done = false;
        do {
            do {
                System.out.print("Enter Player A's move [RPS]: ");

                if (in.hasNextLine()) {
                    playA = in.nextLine();
                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("\nEnter a valid input, not : " + trash);
                }
            } while (!done);

            do {
                System.out.print("Enter Player B's move [RPS]: ");

                if (in.hasNextLine()) {
                    playB = in.nextLine();
                    done = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("\nEnter a valid input, not : " + trash);
                }
            } while (!done);

            if (playA.equalsIgnoreCase("R")) {
                if(playB.equalsIgnoreCase("R")){
                    System.out.println("Its a tie!");
                }
                else if (playB.equalsIgnoreCase("P")){
                    System.out.println("Paper beats Rock! Player B wins!");
                }
                else {
                    System.out.println("Rock beats Scissors! Player A wins!");
                }

            } else if (playA.equalsIgnoreCase("P")) {
                if(playB.equalsIgnoreCase("R")){
                    System.out.println("Paper covers Rock! Player A wins!");
                }
                else if (playB.equalsIgnoreCase("P")){
                    System.out.println("Its a tie!");
                }
                else {
                    System.out.println("Scissors beat Paper! Player B wins!");
                }
            } else {
                if(playB.equalsIgnoreCase("R")){
                    System.out.println("Rock beats Scissors! Player B wins!");
                }
                else if (playB.equalsIgnoreCase("P")){
                    System.out.println("Scissors beat Paper! Player A wins!");
                }
                else {
                    System.out.println("Its a tie!");
                }
            }

        }while(!done);
    }
}