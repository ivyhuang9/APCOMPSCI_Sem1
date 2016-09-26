import java.util.Scanner;

public class Cube
{
	static double side;
	
	public static double calcSurf()
	{
		return 6*side*side;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube with sides of length %f is %.5f",side,calcSurf());
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter side length: ");
		side = sc.nextDouble();
		//prints surface area
		print();
	}
}