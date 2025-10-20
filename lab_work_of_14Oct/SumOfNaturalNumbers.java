import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    // Method to calculate sum of first n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;   // Adding each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = findSum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result);

        sc.close();
    }
}
