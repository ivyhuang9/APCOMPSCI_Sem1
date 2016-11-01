import java.util.Scanner;

public class DigitAdder
{
	public static int sumDigits(int number)
	{
		//initializes sum and num
		int sum = 0;
		int num = number;
		//finds and returns sum of digits
		while(num > 0)
		{
			sum += num%10;
			num = (int)(num/10);
		}
		return sum;
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		//finds and prints sum of digits
		System.out.printf("The sum of the digits in %d is %d.", number, sumDigits(number));
	}
}