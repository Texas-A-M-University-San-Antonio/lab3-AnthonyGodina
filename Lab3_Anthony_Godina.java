// Name: Anthony Godina
// Date: 9/12/25

    // Lab 3
import java.util.Scanner;

public class Lab3_Anthony_Godina
{

    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);

         double P; // I put the variables in the right code
         double r;
         double A;
            int t;
            double percent;
         // prompt the user to enter the inital value 
        System.out.print("input the initial value of the home please: ");

        P = input.nextDouble(); // input put by the user
        System.out.print("input the interest rate please: ");
        r = input.nextDouble();
        percent = r / 100; // I put the formula to convert the percent to a decimal
            r = percent; // I put the variable r to equal the percent
        System.out.print("input the number of elapsed years: " );  // I also put the system to print out the what i want
        t = input.nextInt();
         A = P * Math.pow((1 + r), t); // I put the formula
            System.out.print("the total amount after the interest is: " + A); // I put the system to print out the total amount after interest
       


    }
}