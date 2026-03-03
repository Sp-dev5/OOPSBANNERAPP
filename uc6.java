/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods. This enhances code reusability and
 * maintainability by separating pattern generation logic from the main display logic.
 *
 * @author Developer
 * @version 6.0
 */

// Extend the User Story 5 to display the OOPS banner using a modular approach by
// not only using string arrays to hold banner lines and printing them in a loop.
// But also by defining and populating the array in a more organized way using
// dedicated helper methods to generate each letter pattern.

// Key Requirements:
// - Create separate methods to build patterns for O, P, and S using String.join()
// - At array declaration, call these methods to populate the banner lines in order
// - Maintain the 7-line, 9-character width alignment for each letter
// - Use a loop (enhanced for loop preferred) to print each line of the banner
// - Keep output visually identical to UC5 while improving reusability

// Hint:
// - Use static methods to avoid object instantiation
// - Each method returns a String[] containing 7 lines for that letter
// - Combine all letter patterns in the array declaration

public class OOPSBannerApp {
    /**
     * Method to generate the pattern for the letter 'O'
     * Returns a 7-line String array representing the character O
     */
    public static String[] getOPattern() {
        return new String[] {
                String.join("", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "O", " ", "*", " ", "*"),
                String.join("", "*", " ", "O", " ", "*", " ", "*"),
                String.join("", "*", " ", "O", " ", "*", " ", "*"),
                String.join("", "*", " ", "O", " ", "*", " ", "*"),
                String.join("", "*", " ", "O", " ", "*", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*")
        };
    }

    /**
     * Method to generate the pattern for the letter 'P'
     * Returns a 7-line String array representing the character P
     */
    public static String[] getPPattern() {
        return new String[] {
                String.join("", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "P", " ", "*", " ", "*"),
                String.join("", "*", " ", "P", " ", "*", " ", "*"),
                String.join("", "*", " ", "P", " ", "*", " ", "*"),
                String.join("", "*", " ", "P", " ", "*", " ", "*"),
                String.join("", "*", " ", "P", " ", "*", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*")
        };
    }

    /**
     * Method to generate the pattern for the letter 'S'
     * Returns a 7-line String array representing the character S
     */
    public static String[] getSPattern() {
        return new String[] {
                String.join("", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "S", " ", "*", " ", "*"),
                String.join("", "*", " ", "S", " ", "*", " ", "*"),
                String.join("", "*", " ", "S", " ", "*", " ", "*"),
                String.join("", "*", " ", "S", " ", "*", " ", "*"),
                String.join("", "*", " ", "S", " ", "*", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*")
        };
    }

    /**
     * Main method to run the banner display
     */
    public static void main(String[] args) {
        // Declare String array variable to hold the OOPS banner lines
        // Using helper methods to generate each letter's pattern
        // This demonstrates the modular approach by composing larger logic
        // from smaller, reusable helper methods
        String[] lines = {
                // First O pattern (7 lines)
                getOPattern()[0],
                getOPattern()[1],
                getOPattern()[2],
                getOPattern()[3],
                getOPattern()[4],
                getOPattern()[5],
                getOPattern()[6],
                // First P pattern (7 lines)
                getPPattern()[0],
                getPPattern()[1],
                getPPattern()[2],
                getPPattern()[3],
                getPPattern()[4],
                getPPattern()[5],
                getPPattern()[6],
                // Second P pattern (7 lines)
                getPPattern()[0],
                getPPattern()[1],
                getPPattern()[2],
                getPPattern()[3],
                getPPattern()[4],
                getPPattern()[5],
                getPPattern()[6],
                // S pattern (7 lines)
                getSPattern()[0],
                getSPattern()[1],
                getSPattern()[2],
                getSPattern()[3],
                getSPattern()[4],
                getSPattern()[5],
                getSPattern()[6]
        };

        // Use a for-each loop to iterate through the array
        // and print each line of the visual effect for the message "OOPS"
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
