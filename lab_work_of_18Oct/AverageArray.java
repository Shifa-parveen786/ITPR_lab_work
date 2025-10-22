import java.util.Scanner;

class AverageCalculator {
    int numbers[];   // Array to store numbers
    double average;  // Variable to store average

    // Constructor to take input from user
    AverageCalculator() {
        Scanner sc = new Scanner(System.in);
        numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / 10;
    }

    // Method to display average
    void displayAverage() {
        System.out.println("Average of the 10 numbers is: " + average);
    }
}

public class AverageArray {
    public static void main(String[] args) {
        // Create object
        AverageCalculator obj = new AverageCalculator();
        // Display average
        obj.displayAverage();
    }
}
