/**
 * SumOfDigits - Java Control Flow Practice Program
 *
 * Program Description:
 * This program takes an integer input from the user and calculates the sum of all digits
 * in that number. For example, if the input is 12345, the output will be 1+2+3+4+5 = 15.
 *
 * Concepts Practiced:
 * - While loops
 * - Modulo operator (%) for extracting digits
 * - Integer division (/) for removing processed digits
 * - Variable declarations and initialization
 * - Compound assignment operator (+=)
 *
 * @author Developer
 * @version 1.0
 */

import java.util.Scanner;

class SumOfDigits {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object to take user input
        Scanner input = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a number: ");
        int originalNumber = input.nextInt();

        // Define variables - number is used for processing, sum stores the result
        int number = originalNumber;
        int sum = 0;

        // Run while loop to access each digit of the number
        // Loop continues as long as number is not equal to 0
        while (number != 0) {
            
            // Use number % 10 to find the last digit of the number
            // For example: 12345 % 10 = 5
            int digit = number % 10;

            // Add the extracted digit to the sum
            // Compound assignment operator: sum += digit is equivalent to sum = sum + digit
            sum += digit;

            // Use integer division to remove the last digit from the number
            // For example: 12345 / 10 = 1234
            number = number / 10;
            
            // The loop repeats: 1234 % 10 = 4, then 123 % 10 = 3, and so on
            // until number becomes 0 and the loop terminates
        }

        // Display the result
        System.out.println("The sum of digits of number: " + originalNumber + " = " + sum);

        // Closing the Scanner Stream
        input.close();
    }
}
