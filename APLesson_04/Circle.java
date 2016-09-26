import java.util.Scanner;

public class Circle
{
	static double r;
	
	public static double calcArea()
	{
		return 3.14159*r*r;
	}
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f",r,calcArea());
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter radius: ");
		r = sc.nextDouble();
		//prints area
		print();
	}
}