import java.util.Scanner;

public class BMICalculator
{
	public static void main(String[]args)
	{
		//creates Scanner named sc
		Scanner sc = new Scanner(System.in);
		//asks for user's height and weight
		System.out.print("Enter your height in inches: ");
		double height = sc.nextDouble();
		System.out.print("Enter your weight in pounds: ");
		double weight = sc.nextDouble();
		//calculates BMI and prints it
		double BMI = 703*weight/(height*height);
		System.out.println("Your BMI is "+BMI+".");
	}
}