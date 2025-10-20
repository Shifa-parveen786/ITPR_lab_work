import java.util.Scanner;
public class Number {
public static void main(String [] args) {
	        int number;

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		number= sc.nextInt();
		System.out.println("-------------------------------------");


		System.out.println("number : "+number);

		if(number > 0)
		{
			System.out.println(number+ " is positive number");
		}
		else if(number<0)
		{
			System.out.println(number+ " is negative number");
		}
                else {
                      System.out.println("The number is Zero");
}
	}

}

