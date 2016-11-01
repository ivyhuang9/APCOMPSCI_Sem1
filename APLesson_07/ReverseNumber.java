import java.util.Scanner;

public class ReverseNumber
{
	public static int getReverse(int number)
	{
		//initializes values
		int num = number;
		int rev = 0;
		//finds and returns reverse number
		while(num > 0)
		{
			rev *= 10;
			rev += num%10;
			num = (int)(num/10);
		}
		return rev;
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes in user input
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		//finds and prints reverse number
		System.out.printf("%d reversed is %d.", number, getReverse(number));
	}
}