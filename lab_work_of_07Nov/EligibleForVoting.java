class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class EligibleForVoting {
    public static void main(String[] args) {
        try {
            int age = 16;

            // Check age
            if (age < 18) {
                throw new AgeException("You are not eligible for voting.");
            }

            System.out.println("You are eligible for voting.");

        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}