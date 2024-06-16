import java.util.Scanner;

public class RecursiveSum {
    public static void main(String args[]) {
        // Calling recursive method with 5 numbers to input
        int sum = getSum(5);
        // Printing sum
        System.out.println("Sum: " + sum);
    }

    public static int getSum(int iterations) {

        // Reading user input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        String n = s.nextLine();

        if (iterations > 1) {
            // Recursive case with 1 less iterations
            return Integer.parseInt(n) + getSum(iterations - 1);
        } else {
            // Base case
            return Integer.parseInt(n);
        }
    }

}
