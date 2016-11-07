import java.util.Scanner;

public class Lucky7s
{
	public static int luck(int num)
	{
		if(num > 0)
		{
			if(num % 10 == 7)
			{
				return 1 + luck(num/10);
			}
			else
			{
				return 0 + luck(num/10);
			}
		}
		return 0;
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		//prints num of 7s in the number
		System.out.println(luck(n));
	}
}