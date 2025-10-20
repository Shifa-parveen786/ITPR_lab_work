// Program to calculate Area and Perimeter of a Triangle
// Using Class, Object, and Constructor in Java

class Triangle {
    double angle1, angle2, angle3;

    // Constructor to initialize sides of the triangle
    Triangle(double a1, double a2, double a3) {
        angle1 = a1;
        angle2 = a2;
        angle3 = a3;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return angle1 + angle2 + angle3;
    }

    // Method to calculate area using Heron's formula
    double calculateArea() {
        double s = calculatePerimeter() / 2;  // semi-perimeter
        return Math.sqrt(s * (s - angle1) * (s - angle2) * (s - angle3));
    }
}

public class AreaAndPerimeterOfTriangle {
    public static void main(String[] args) {
        // Create object and initialize angles using constructor
        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Angle 1: " + t.angle1);
        System.out.println("Angle 2: " + t.angle2);
        System.out.println("Angle 3: " + t.angle3);
        System.out.println("Perimeter of Triangle: " + t.calculatePerimeter());
        System.out.println("Area of Triangle: " + t.calculateArea());
    }
}
