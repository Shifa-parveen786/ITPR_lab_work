import java.util.Scanner;

public class Factorial {
    
    // Method to calculate factorial
    public static long findFactorial(int n) {
        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;   // Multiply each number to get factorial
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long result = findFactorial(num);
        System.out.println("The factorial of " + num + " is: " + result);

        sc.close();
    }
}
