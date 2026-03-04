import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        // Read the integer input from the user and store it in the 'num' variable
        int num = reader.nextInt();

        // Check if the remainder of num divided by 2 is 0
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        
        // Close the scanner
        reader.close();
    }
}
