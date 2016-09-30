import java.util.Scanner;

public class Circle
{	
	public static double calcArea(double r)
	{
		return 3.14*r*r;
	}
	public static void print(double r,double area)
	{
		System.out.printf("The area of a circle with a radius of %f is %.5f",r,area);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter radius: ");
		double r = sc.nextDouble();
		//prints area
		double area = calcArea(r);
		print(r,area);
	}
}