import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playA = "";
        String playB = "";
        String playAgain ="";
        boolean done = false;
        do {
            do {
                System.out.print("Enter Player A's move [RPS]: ");

                playA = in.nextLine();

                if (playA.equalsIgnoreCase("r")) {
                    done = true;
                }
                else if (playA.equalsIgnoreCase("p")){
                    done = true;
                }
                else if (playA.equalsIgnoreCase("s")){
                    done = true;
                }
                else {
                    System.out.println("\nEnter a valid input, not : " + playA);
                    done = false;
                }
            } while (!done);

            do {
                System.out.print("Enter Player B's move [RPS]: ");

                playB = in.nextLine();

                if (playB.equalsIgnoreCase("r")) {
                    done = true;
                }
                else if (playB.equalsIgnoreCase("p")){
                    done = true;
                }
                else if (playB.equalsIgnoreCase("s")){
                    done = true;
                }
                else {
                    System.out.println("\nEnter a valid input, not : " + playB);
                    done = false;
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
            }
            else {
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

            System.out.print("Do you want to play again?: ");

            playAgain = in.next();

            if(playAgain.equalsIgnoreCase("Y")){
                done = false;
            }
            else if(playAgain.equalsIgnoreCase("N")){
                System.out.println("Thank you for playing!");
                done = true;
            }
            else{
                System.out.println("Please enter a valid input!");
            }

        }while(!done);
    }
}