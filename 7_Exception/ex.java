import java.util.InputMismatchException;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // this block will egenerate exceptions that are not handeled
        {
            // int[] numbers = {1, 2, 3};
            // System.out.print("Enter an index to access the array: ");
            // int index = scanner.nextInt();
            // int value = numbers[index];
            // System.out.println("Value at index " + index + ": " + value);

            // System.out.print("Enter a number: ");
            // String input = scanner.next();
            // int number = Integer.parseInt(input);
            // System.out.println("Parsed number: " + number);

            // System.out.print("Enter numerator: ");
            // int numerator = scanner.nextInt();
            // System.out.print("Enter denominator: ");
            // int denominator = scanner.nextInt();
            // int result = numerator / denominator;
            // System.out.println("Result of division: " + result);
        }

        // Handling ArrayIndexOutOfBoundsException
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.print("\nEnter an index to access the array: ");
            int index = scanner.nextInt();
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Enter a Iteger value not STRING: ");
        }

        // Handling NumberFormatException
        try {
            System.out.print("\nEnter a number: ");
            String input = scanner.next();
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e.getMessage());
        }

        // Handling ArithmeticException
        try {
            System.out.print("\nEnter numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }

        scanner.close();
        System.out.println("\nExiting after closing scanner");
    }
}