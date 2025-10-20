// Program to calculate Addition, Difference, and Product of two numbers
// Using Class, Object, and Constructor in Java

class Calculator {
    int num1;
    int num2;

    // Constructor to initialize numbers
    Calculator(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    // Method to calculate addition
    int add() {
        return num1 + num2;
    }

    // Method to calculate difference
    int subtract() {
        return num1 - num2;
    }

    // Method to calculate product
    int multiply() {
        return num1 * num2;
    }
}

public class AdditionDifferenceAndProduct {
    public static void main(String[] args) {
        // Create object and pass values using constructor
        Calculator calc = new Calculator(10, 5);

        System.out.println("Number 1: " + calc.num1);
        System.out.println("Number 2: " + calc.num2);
        System.out.println("Addition: " + calc.add());
        System.out.println("Difference: " + calc.subtract());
        System.out.println("Product: " + calc.multiply());
    }
}
