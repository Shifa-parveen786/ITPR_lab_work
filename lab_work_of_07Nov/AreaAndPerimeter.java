// Custom Exception for wrong values
class InvalidSize extends Exception {
    public InvalidSize(String message) {
        super(message);
    }
}

public class AreaAndPerimeter {
    public static void main(String[] args) {
        try {
            int length = 5;
            int breadth = 3;

            // Check if values are valid
            if (length <= 0 || breadth <= 0) {
                throw new InvalidSize("Length and Breadth must be greater than 0");
            }

            int area = length * breadth;
            int perimeter = 2 * (length + breadth);

            System.out.println("Area = " + area);
            System.out.println("Perimeter = " + perimeter);

        } catch (InvalidSize e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}