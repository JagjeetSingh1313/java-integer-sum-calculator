import java.util.ArrayList;
import java.util.Scanner;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store Integer objects
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Prompt the user to enter integers
        System.out.println("Enter integers separated by spaces (e.g., '1 2 3 4 5'):");
        
        // Read the entire line of input
        String inputLine = scanner.nextLine();
        
        // Split the input line into individual strings
        String[] numberStrings = inputLine.split(" ");
        
        // Parse each string to an int and add to the ArrayList (autoboxing)
        for (String numberString : numberStrings) {
            try {
                int number = Integer.parseInt(numberString);
                numbers.add(number);  // Autoboxing: int to Integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + numberString + "' is not a valid integer. Skipping.");
            }
        }
        
        // Calculate the sum using an enhanced for loop (unboxing)
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;  // Unboxing: Integer to int
        }
        
        // Display the sum
        System.out.println("The sum of the integers is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
