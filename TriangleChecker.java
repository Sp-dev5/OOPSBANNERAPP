/**
 * TriangleChecker - Java Control Flow Practice Program
 *
 * Program Description:
 * This program checks if 3 given values are valid internal angles of a triangle.
 * A valid triangle has internal angles that sum to 180 degrees.
 *
 * Concepts Practiced:
 * - Conditional Statements (if-else)
 * - Boolean Expressions and Comparison Operators
 * - Scanner for user input
 * - Variable declarations and naming conventions
 *
 * @author Developer
 * @version 1.0
 */

import java.util.Scanner;

class TriangleChecker {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Get 3 input values for angles of a triangle
        System.out.print("Enter angle x: ");
        int x = input.nextInt();
        
        System.out.print("Enter angle y: ");
        int y = input.nextInt();
        
        System.out.print("Enter angle z: ");
        int z = input.nextInt();

        // Find the sum of all three angles
        int sumOfAngles = x + y + z;

        // Display the angles and their sum
        System.out.println("\nThe given angles " + x + ", " + y + ", " + z + 
                           " add to " + sumOfAngles);

        // Check if sum is equal to 180 and display appropriate message
        if (sumOfAngles == 180) {
            System.out.println("✓ The given angles are internal angles of a Triangle");
        } else {
            System.out.println("✗ The given angles are NOT internal angles of a Triangle");
        }

        // Closing the Scanner Stream
        input.close();
    }
}
