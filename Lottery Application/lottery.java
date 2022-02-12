import java.util.*;

public class lottery 
{
    public static void main(String [] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            // Scanning the lottery number from user
            System.out.print("Enter a number between 1 and 10: ");
            int number = sc.nextInt();

            Random rndNum = new Random();
            int winningNumber = rndNum.nextInt(10) + 1;

            // Printing the lottery number of user
            System.out.println("Your Number: "+ number);

            // Printing the number of won lottery
            System.out.println("The Winning number: "+ winningNumber);

            // Printing the conclusion
            if(winningNumber == number)
            {
                System.out.println("Congratulations! You win.");
            }
            else
            {
                System.out.println("Better Luck Next Time!");
            }
        }
    }    
}
