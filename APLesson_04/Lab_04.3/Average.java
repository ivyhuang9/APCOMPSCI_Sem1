import java.util.Scanner;

public class Average
{	
	public static double average(double n1, double n2, double n3)
	{
		return (n1+n2+n3)/3;
	}
	public static void print(double n1, double n2, double n3, double avg)
	{
		System.out.printf("The average of %f, %f, and %f is %.5f",n1,n2,n3,avg);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter num1: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter num2: ");
		double num2 = sc.nextDouble();
		System.out.print("Enter num3: ");
		double num3 = sc.nextDouble();
		//prints average
		double avg = average(num1,num2,num3);
		print(num1,num2,num3,avg);
	}
}