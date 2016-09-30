import java.util.Scanner;

public class Rectangle
{
	static double l,w,perimeter;
	
	public static void calcPerim()
	{
		perimeter = 2*(l+w);
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f ft around.",perimeter);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter length: ");
		l = sc.nextDouble();
		System.out.print("Enter width: ");
		w = sc.nextDouble();
		//prints perimeter
		calcPerim();
		print();
	}
}