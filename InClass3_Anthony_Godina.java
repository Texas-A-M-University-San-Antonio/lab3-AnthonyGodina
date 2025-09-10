/**
 * Name: [Enter Your Name Here]
 * Date: [Enter Today's Date]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
 */
import java.util.Scanner;
// Don't forget to import and declare a Scanner for user input.

public class InClass3_Anthony_Godina
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        // In-Class 3 Example:
        double side, volume, surfaceArea;
        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("Enter the length of the cube's side:");

        // Step 2: Read the user's input and store it in a variable.
        side = input.nextDouble(); // side is INPUT by the user

        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surfaceArea = Math.pow(side, 2);

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.print("The volume of the cube is " + volume);
        System.out.print("The surfaceArea of the cube is " + surfaceArea);
    }
}