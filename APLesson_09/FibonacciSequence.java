import java.util.Scanner;

public class FibonacciSequence
{
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user inputs
		System.out.print("Please enter your starting number: ");
		int start = sc.nextInt();
		System.out.print("Please enter your sequence size: ");
		int size = sc.nextInt();
		//creates array seq
		int[] seq = new int[size-start];
		//prints a Fibonacci sequence based on user inputs
		for(int i = 0; i < seq.length; i++)
		{
			if(i == 0 || i ==1)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			System.out.print(seq[i] + " ");
		}
	}
}