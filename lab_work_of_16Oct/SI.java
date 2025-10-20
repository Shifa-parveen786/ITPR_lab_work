// Program to calculate Simple Interest using Class, Object, and Constructor

class SimpleInterest {
    double principal;
    double rate;
    double time;

    // Constructor to initialize values
    SimpleInterest(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    // Method to calculate Simple Interest
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class SI {
    public static void main(String[] args) {
        // Create object and pass values using constructor
        SimpleInterest si = new SimpleInterest(10000, 5, 2);

        double interest = si.calculateInterest();

        System.out.println("Principal Amount: " + si.principal);
        System.out.println("Rate of Interest: " + si.rate + "%");
        System.out.println("Time Period: " + si.time + " years");
        System.out.println("Simple Interest: " + interest);
    }
}
