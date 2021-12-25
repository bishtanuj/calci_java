import java.util.*;
import java.lang.Math;

public class calculator_2 
{
    /* function to calculate addition */
    public static void calculatingAddition()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the number of elements to add: ");
            int range = sc.nextInt();

            int array[] = new int[range];
            int add = 0;
            System.out.println("Enter the "+ range +" elements: ");
            for(int i=0; i<range; i++)
            {
                array[i] = sc.nextInt();
                add = add + array[i];   
            }

            System.out.println("Additon: "+ add);
        }
    }

    /* function to calculate subtraction */
    public static void calculatingSubtraction()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the number from you want to subtract: ");
            int num_1 = sc.nextInt();

            System.out.print("Enter another number: ");
            int num_2 = sc.nextInt();

            int subtract = num_1 - num_2;

            System.out.println("Subtraction: "+ subtract);
        }
    }

    /* function to calculate division */
    public static void calculatingDivision()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the dividend: ");
            double dividend = sc.nextDouble();

            System.out.print("Enter the divisor: ");
            double divisor = sc.nextDouble();

            double division = dividend/divisor;

            System.out.println("Division: "+ division);
        }
    }

    /* function to calculate division */ 
    public static void calculatingMultiplication()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the multiplicand: ");
            int multiplicand = sc.nextInt();

            System.out.print("Enter the multiplier: ");
            int multiplier = sc.nextInt();

            int product = multiplicand * multiplier;

            System.out.println("Product: "+ product);
        }
    }

    /* function to calculate percentage */
    public static void calculatingPercentage()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the total number of elements: ");
            int num = sc.nextInt();

            float Array[] = new float[num];
            float sum = 0;
            System.out.println("Enter the "+ num +" elements: ");
            for(int i=0; i<num; i++)
            {
                Array[i] = sc.nextInt();
                sum = sum + Array[i];
            }

            System.out.print("Enter the total of "+ num +" elements: ");
            float total = sc.nextFloat();

            float percentage = (sum/total)*100;

            System.out.println("Percentage: "+ percentage +"%");
        }
    }

    /* function to calculate modulus */
    public static void calculatingModulus()
    {
        try(Scanner sc = new Scanner(System.in))
        {
           System.out.print("Enter the dividend: ");
           int dividend = sc.nextInt();

           System.out.print("Enter the divisor: ");
           int divisor = sc.nextInt();

           int modulus = dividend % divisor;
           System.out.println("Modulus: "+ modulus);
        }
    }

    /* function to calculate square root */
    public static void calculatingSquareRoot()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            double squareRoot = Math.sqrt(num);

            System.out.println("Square root: "+ squareRoot);
        }
    }

    /* function to calculate cube root */
    public static void calculatingCubeRoot()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            double cubeRoot = Math.cbrt(num);

            System.out.println("Cube Root: "+ cubeRoot);
        }
    }

    /* function to calculate square */
    public static void calculatingSquare()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int square = num * num;

            System.out.println("Square: "+ square);
        }
    }

    /* funciton to calculate cube */
    public static void calculatingCube()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int cube = num * num * num;

            System.out.println("Cube: "+ cube);
        }
    }

    /* function to calculate exponent */
    public static void calculatingExponent()
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            System.out.print("Enter power: ");
            double power = sc.nextDouble();

            double exponent = Math.pow(num, power);

            System.out.println("Exponent: "+ exponent);

        }
    }

    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            /* showing all the operations to users */
            System.out.println("***** OPERATIONS OF CALCULATORS *****");
            System.out.println("1.  ADDITION"); 
            System.out.println("2.  SUBSTRACTION");
            System.out.println("3.  DIVISION");
            System.out.println("4.  MULTIPLICATION");
            System.out.println("5.  PERCENTAGE");
            System.out.println("6.  MODULUS");
            System.out.println("7.  SQUARE ROOT");
            System.out.println("8.  CUBE ROOT");
            System.out.println("9.  SQUARE");
            System.out.println("10. CUBE");
            System.out.println("11. EXPONENT");
            
            /* scanning the choice from the user */
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    calculatingAddition();
                    break;
                }

                case 2:
                {
                    calculatingSubtraction();
                    break;
                }

                case 3:
                {
                    calculatingDivision();
                    break;
                }

                case 4:
                {
                    calculatingMultiplication();
                    break;
                }

                case 5:
                {
                    calculatingPercentage();
                    break;
                }

                case 6:
                {
                    calculatingModulus();
                    break;
                }

                case 7:
                {
                    calculatingSquareRoot();
                    break;
                }

                case 8:
                {
                    calculatingCubeRoot();
                    break;
                }

                case 9:
                {
                    calculatingSquare();;
                    break;
                }

                case 10:
                {
                    calculatingCube();
                    break;
                }

                case 11:
                {
                    calculatingExponent();
                    break;
                }

                default:
                {
                    System.out.println("!! Enter Right Choice !!");
                }
            }
        }    
    }    
}
