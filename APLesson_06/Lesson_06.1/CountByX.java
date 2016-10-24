import java.util.Scanner;

public class CountByX
{
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user inputs
		System.out.print("Enter number to count up to: ");
		int n1 = sc.nextInt();
		System.out.print("Enter number to count by: ");
		int n2 = sc.nextInt();
		//prints to n1 by n2
		for(int i = n2; i <= n1; i+= n2)
		{
			System.out.print(i+"\t");
		}
	}
}