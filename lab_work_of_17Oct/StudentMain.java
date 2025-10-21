// Program to create a Student class and display details using Constructor

import java.util.Scanner;

class Student {
    String name;
    int age;
    String standard;
    int rollNo;

    // Constructor to initialize values
    Student(String n, int a, String s, int r) {
        name = n;
        age = a;
        standard = s;
        rollNo = r;
    }

    // Method to display student details
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Standard: " + standard);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Standard: ");
        String standard = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        // Creating object and displaying data
        Student s1 = new Student(name, age, standard, rollNo);
        s1.display();

        sc.close();
    }
}
