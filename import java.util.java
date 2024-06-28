import java.util.Scanner;

public class GreetingProgram {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a greeting message
        System.out.println("Hello, " + name + "! Welcome to the Java program.");

        // Close the scanner
        scanner.close();
    }
}
