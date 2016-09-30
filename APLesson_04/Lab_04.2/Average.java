import java.util.Scanner;

public class Average
{
	static double num1,num2,num3,avg;
	
	public static void average()
	{
		avg = (num1+num2+num3)/3;
	}
	public static void print()
	{
		System.out.printf("The average of %f, %f, and %f is %.5f",num1,num2,num3,avg);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter num1: ");
		num1 = sc.nextDouble();
		System.out.print("Enter num2: ");
		num2 = sc.nextDouble();
		System.out.print("Enter num3: ");
		num3 = sc.nextDouble();
		//prints average
		average();
		print();
	}
}