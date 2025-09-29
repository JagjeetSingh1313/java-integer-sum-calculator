import java.util.ArrayList;
import java.util.Scanner;

public class IntegerSumCalculator {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
       
        ArrayList<Integer> numbers = new ArrayList<>();
    
        System.out.println("Enter integers separated by spaces (e.g., '1 2 3 4 5'):");

        String inputLine = scanner.nextLine();

        String[] numberStrings = inputLine.split(" ");g)
        for (String numberString : numberStrings) {

            try {
                int number = Integer.parseInt(numberString);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + numberString + "' is not a valid integer. Skipping.");
            }
        }
       
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;  
        
        System.out.println("The sum of the integers is: " + sum);
    
        scanner.close();
    }
}
