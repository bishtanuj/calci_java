import java.util.*;

public class rockPaperScisor 
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            // Introduction of the rules of the game
            System.out.println("\n*** WELCOME TO THE GAME ***");
            System.out.println("\nRULES OF THE GAME IS AS FOLLOWS: ");
            System.out.println("\nRock vs Paper: Paper Wins");
            System.out.println("Rock vs Scissor: Rock Wins");
            System.out.println("Paper vs Scissor: Scissor Wins");

            System.out.println("\n1.  Rock");
            System.out.println("2.  Paper");
            System.out.println("3.  Scissor");

            // Scanning the choice from the user
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            if(choice > 3)
            {
                System.out.print("\nEnter Right Choice: ");
                choice = sc.nextInt();
            }

            // Naming the choice of the user
            String choiceName;
            if(choice == 1)
            {
                choiceName = "Rock";
            }
            else if(choice == 2)
            {
                choiceName = "Paper";
            }
            else
            {
                choiceName = "Scissor";
            }

            // Printing the choice of the user
            System.out.println("Your Choice: "+ choiceName);

            // Asking computer for choice
            System.out.println();
            System.out.println("Computer Turn.....");

            Random rndNum = new Random();
            int computerChoice = rndNum.nextInt(3) + 1;

            // Naming the choice of the computer
            String computerChoiceName;
            if(computerChoice == 1)
            {
                computerChoiceName = "Rock";
            }
            else if(computerChoice == 2)
            {
                computerChoiceName = "Paper";
            }
            else
            {
                computerChoiceName = "Scissor";
            }

            // Printing the choice of the computer
            System.out.println("Computer Choice: "+ computerChoiceName);

            // Result Printing
            System.out.println();
            System.out.println(choiceName +" vs "+ computerChoiceName);

            String result;
            if((choice == 1 && computerChoice == 2) || (choice == 2 && computerChoice == 1))
            {
                result = "Paper";
            }
            else if((choice == 1 && computerChoice == 3) || (choice == 3 && computerChoice == 1))
            {
                result = "Rock";
            }
            else
            {
                result = "Scissor";
            }

            // Printing Conclusion
            System.out.println();
            if(choiceName == computerChoiceName)
            {
                System.out.println("MATCH DRAWN !");
            }
            else if(result == choiceName)
            {
                System.out.println("Hurray! You win.");
            }
            else
            {
                System.out.println("Computer Wins!");
            }

            System.out.println("\nThanks for playing!");
        }
    }
}
