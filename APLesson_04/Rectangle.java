import java.util.Scanner;

public class Rectangle
{
	static double length;
	static double width;
	
	public static double calcPerim()
	{
		double p = 2*(length+width);
		return p;
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f ft around.",calcPerim());
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter length: ");
		length = sc.nextDouble();
		System.out.print("Enter width: ");
		width = sc.nextDouble();
		//prints perimeter
		print();
	}
}