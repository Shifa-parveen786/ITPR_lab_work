import java.util.Scanner;

class NumberCounter {
    int numbers[];       // Array to store numbers
    int positiveCount;   // Count of positive numbers
    int negativeCount;   // Count of negative numbers

    // Constructor to input numbers and count positive & negative numbers
    NumberCounter() {
        Scanner sc = new Scanner(System.in);
        numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] > 0)
                positiveCount++;
            else if (numbers[i] < 0)
                negativeCount++;
        }
    }

    // Method to display result
    void displayCount() {
        System.out.println("Total Positive Numbers: " + positiveCount);
        System.out.println("Total Negative Numbers: " + negativeCount);
    }
}

public class PositiveNegativeCount {
    public static void main(String[] args) {
        // Create object and display result
        NumberCounter obj = new NumberCounter();
        obj.displayCount();
    }
}
