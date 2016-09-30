import java.util.Scanner;

public class Cube
{
	public static double calcSurf(double side)
	{
		return 6*side*side;
	}
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube with sides of length %f is %.5f",side,sa);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter side length: ");
		double side = sc.nextDouble();
		//prints surface area
		double sa = calcSurf(side);
		print(side,sa);
	}
}