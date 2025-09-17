/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;


public class DistanceMultiple
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // signature
        System.out.println("Shuler Wiegerink\nAPCS-A\n2.2-2.3 program");


        // prompt user for the number of runs
        System.out.println("\n\nHow many timed would you like the program to run:  ");
        int numRuns = sc.nextInt();


        for (int i = 0; i < numRuns; i++) {
            // prompt user for inputs
            System.out.println("\nEnter 2 coordinates:  ");

            // set delimiter pattern for correct formatting
            sc.useDelimiter("[(),\\s]+");

            double x1 = sc.nextInt();
            double y1 = sc.nextInt();
            double x2 = sc.nextInt();
            double y2 = sc.nextInt();

            // calculate and output
            System.out.println("The distance is " + Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));


        }
    }
}