import java.util.Scanner;

public class SimpleAdditionCalculator {

    // Method to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the first number
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Prompt user for the second number
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform the addition
        double result = add(num1, num2);
        
        // Display the result
        System.out.println("The result of addition is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
