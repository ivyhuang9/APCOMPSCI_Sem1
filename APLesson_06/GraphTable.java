import java.util.Scanner;

public class GraphTable
{
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user inputs
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("Enter the size of the table: ");
		int size = sc.nextInt();
		//prints table
		System.out.printf("___i_|_i*num___\n");

		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%4d |%4d\n", i, i*num);
		}
	}
}