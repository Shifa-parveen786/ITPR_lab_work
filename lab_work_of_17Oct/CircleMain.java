// Program to calculate Area and Perimeter of a Circle using Class, Object, and Constructor

import java.util.Scanner;

class Circle {
    double radius;

    // Constructor to initialize radius
    Circle(double r) {
        radius = r;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();

        // Creating object of Circle class
        Circle c1 = new Circle(r);

        // Displaying results
        System.out.println("Area of Circle = " + c1.calculateArea());
        System.out.println("Perimeter of Circle = " + c1.calculatePerimeter());

        sc.close();
    }
}
