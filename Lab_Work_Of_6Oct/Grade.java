import java.util.Scanner;
public class Grade {
public static void main(String [] args) {
                float math, physics, chemistry, hindi, english;
	        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks of math : ");
		math= sc.nextFloat();
                System.out.print("Enter the marks of Physics : ");
		physics= sc.nextFloat();
                System.out.print("Enter the marks of chemistry : ");
		chemistry= sc.nextFloat();
                System.out.print("Enter the marks of hindi : ");
		hindi= sc.nextFloat();
                System.out.print("Enter the marks of english : ");
		english= sc.nextFloat();

                float Total= (math+physics+chemistry+hindi+english) ;
                System.out.println("TotalMarks : "+Total);

                float percentage=(Total/500)*100 ;
               System.out.println("percentage : "+percentage);

		if(percentage >= 75)
		{
			System.out.println("Grade: A+");
		}
		else if(percentage >= 65)
		{
			System.out.println("Grade: A");
		}
                else if(percentage >= 55)

		{
			System.out.println("Grade: B");
		}
                else if(percentage >= 45)
		{
			System.out.println("Grade: c");
		}
                else {
                      System.out.println("Grade: fail");
                      }
                sc.close();
	}

}
