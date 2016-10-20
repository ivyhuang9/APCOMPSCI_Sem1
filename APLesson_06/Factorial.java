import java.util.Scanner;

public class Factorial
{
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		//finds the factorial
		int factorial = 1;
		for(int i = 1; i <= num; i++)
		{
			factorial *= i;
		}
		//prints the factorial
		System.out.printf("The factorial of %d is %d.", num, factorial);
	}
}