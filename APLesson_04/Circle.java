import java.util.Scanner;

public class Circle
{
	static double r;
	static double area;
	
	public static void calcArea()
	{
		area = 3.14*r*r;
	}
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f",r,area);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter radius: ");
		r = sc.nextDouble();
		//prints area
		calcArea();
		print();
	}
}