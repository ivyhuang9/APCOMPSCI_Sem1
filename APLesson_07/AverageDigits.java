import java.util.Scanner;

public class AverageDigits
{
	public static double avDigits(int number)
	{
		//initializes values
		int digits = 0;
		double average = 0;
		int num = number;
		//finds and returns the average of the digits
		while(num > 0)
		{
			digits += 1;
			average += num%10;
			num = (int)(num/10);
		}
		average = average/digits;
		return average;
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		//finds and prints average
		avDigits(number);
		System.out.printf("The average of the digits in %d is %f", number, avDigits(number));
	}
}