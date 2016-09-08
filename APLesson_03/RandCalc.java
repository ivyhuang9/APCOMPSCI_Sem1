import java.util.Scanner;

public class RandCalc
{
	public static void main(String[]args)
	{
		//creates Scanner named sc
		Scanner sc = new Scanner(System.in);
		//asks user for height and width
		System.out.println("Calculation of area of a rectangle: ");
		System.out.print("Enter height of the rectangle: ");
		double height = sc.nextDouble();
		System.out.print("Enter width of the rectangle: ");
		double width = sc.nextDouble();
		//finds area and prints it
		double area = height*width;
		System.out.println("The area of the rectangle is "+area+".");
	}
}