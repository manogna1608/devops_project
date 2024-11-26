public class Factorial {
    public static void main(String[] args) {
        int number = 5;  // The number to calculate the factorial of
        int factorial = 1;

        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

