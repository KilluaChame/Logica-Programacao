import java.util.Scanner;

public class ValidEx {

    // Main method, the entry point of the application.
    public static void main(String[] args) {

        /* ======================== VALIDATION EXAMPLES ======================== */

        Scanner input = new Scanner(System.in);

        // Validate integer input
        System.out.print("\nEnter an integer: ");
        if (input.hasNextInt()) {
            int integer = input.nextInt();
            System.out.println("You entered the integer: " + integer);
        } else {
            System.out.println("Error: This is not a valid integer.");
            input.next(); // Clear invalid input
        }

        // Validate double input
        System.out.print("\nEnter a decimal number: ");
        if (input.hasNextDouble()) {
            double decimal = input.nextDouble();
            System.out.println("You entered the decimal number: " + decimal);
        } else {
            System.out.println("Error: This is not a valid decimal number.");
            input.next(); // Clear invalid input
        }

        // Validate boolean input
        System.out.print("\nEnter true or false: ");
        if (input.hasNextBoolean()) {
            boolean booleanValue = input.nextBoolean();
            System.out.println("You entered the boolean value: " + booleanValue + "\n");
        } else {
            System.out.println("Error: This is not a valid boolean value.");
            input.next(); // Clear invalid input
        }

        input.close(); // Close the scanner
    }
}