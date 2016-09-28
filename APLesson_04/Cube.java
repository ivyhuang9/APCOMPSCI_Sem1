import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;
	
	public static void calcSurf()
	{
		sa = 6*side*side;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with sides of length %f is %.5f",side,sa);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter side length: ");
		side = sc.nextDouble();
		//prints surface area
		calcSurf();
		print();
	}
}