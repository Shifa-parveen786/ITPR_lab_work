// Program to calculate Curved Surface Area, Total Surface Area, and Volume of a Cylinder
// Using Class, Object, and Constructor in Java

class Cylinder {
    double radius, height;

    // Constructor to initialize radius and height
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    // Method to calculate Curved Surface Area (CSA) = 2 * π * r * h
    double curvedSurfaceArea() {
        return 2 * Math.PI * radius * height;
    }

    // Method to calculate Total Surface Area (TSA) = 2 * π * r * (r + h)
    double totalSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate Volume = π * r² * h
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class AreaAndVolumeOfCylinder {
    public static void main(String[] args) {
        // Create object and initialize radius and height using constructor
        Cylinder c = new Cylinder(7, 10);

        System.out.println("Radius of Cylinder: " + c.radius);
        System.out.println("Height of Cylinder: " + c.height);
        System.out.println("Curved Surface Area: " + c.curvedSurfaceArea());
        System.out.println("Total Surface Area: " + c.totalSurfaceArea());
        System.out.println("Volume: " + c.volume());
    }
}
