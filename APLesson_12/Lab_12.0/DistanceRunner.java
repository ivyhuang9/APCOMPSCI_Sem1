import java.util.Scanner;

public class DistanceRunner
{
	public static void main(String[]args){
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//gets user inputs
		System.out.print("Enter x1: ");
		int x1 = sc.nextInt();
		System.out.print("Enter y1: ");
		int y1 = sc.nextInt();
		System.out.print("Enter x2: ");
		int x2 = sc.nextInt();
		System.out.print("Enter y2: ");
		int y2 = sc.nextInt();
		//creates new Distance object
		Distance object = new Distance(x1,y1,x2,y2);
		//prints distance
		System.out.printf("distance = %.2f\n", object.getDistance());
		
		//takes user inputs again
		System.out.print("Enter x1: ");
		x1 = sc.nextInt();
		System.out.print("Enter y1: ");
		y1 = sc.nextInt();
		System.out.print("Enter x2: ");
		x2 = sc.nextInt();
		System.out.print("Enter y2: ");
		y2 = sc.nextInt();
		//sets new coordinates
		object.setCoordinates(x1,y1,x2,y2);
		//prints distance
		System.out.printf("distance = %.2f", object.getDistance());
	}
}