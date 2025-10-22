import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[20];

        // Input 20 numbers from user
        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display even numbers
        System.out.println("Even numbers are:");
        for (int i = 0; i < 20; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        
        sc.close();
    }
}
