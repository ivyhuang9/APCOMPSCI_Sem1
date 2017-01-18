import java.util.Scanner;

public class MPHRunner
{
	public static void main(String[]args){
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//gets user inputs
		System.out.print("Enter distance: ");
		int distance = sc.nextInt();
		System.out.print("Enter hours: ");
		int hours = sc.nextInt();
		System.out.print("Enter minutes: ");
		int minutes = sc.nextInt();
		//initiates new MilesPerHour object
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		//prints info
		System.out.printf("%d miles in %d hours and %d minutes = %.0f mph\n", distance, hours, minutes, object.getMPH());
		
		//takes user inputs again
		System.out.print("Enter distance: ");
		distance = sc.nextInt();
		System.out.print("Enter hours: ");
		hours = sc.nextInt();
		System.out.print("Enter minutes: ");
		minutes = sc.nextInt();
		//sets values
		object.setValues(distance, hours, minutes);
		//prints info
		System.out.printf("%d miles in %d hours and %d minutes = %.0f mph", distance, hours, minutes, object.getMPH());
	}
}