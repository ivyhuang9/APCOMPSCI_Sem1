import java.util.Scanner;

public class BMIp2
{
	public static String calcCondish(double BMI)
	{
		if(BMI < 18.5)
			return "Underweight";
		else if(BMI <= 24.9)
			return "Normal";
		else if(BMI <= 29.9)
			return "Overweight";
		else if(BMI <= 34.9)
			return "Obese";
		else if(BMI <= 39.9)
			return "Very Obese";
		else
			return "Morbidly Obese";	
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user inputs for height and weight
		System.out.print("Enter your height in inches: ");
		double height = sc.nextDouble();
		System.out.print("Enter your weight in pounds: ");
		double weight = sc.nextDouble();
		//calculates BMI
		double BMI = 703*weight/(height*height);
		//prints BMI and condition
		System.out.printf("Your BMI is: %f\n",BMI);
		System.out.printf("You are %s",calcCondish(BMI));
	}
}