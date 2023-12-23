import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int divisor = scanner.nextInt();
            int result = 10 / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input mismatch error: Please enter a valid number.");
        } finally {
            System.out.println("Finally block executed.");
            scanner.close();
        }
        
        System.out.println("Program continues...");
    }
}
