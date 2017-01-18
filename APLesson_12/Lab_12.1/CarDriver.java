import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args){
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes inputs
		System.out.print("Enter paint color: ");
		String p = sc.nextLine();
		System.out.print("Enter interior type: ");
		String i = sc.nextLine();
		System.out.print("Enter engine type: ");
		String e = sc.nextLine();
		System.out.print("Enter tires: ");
		String t = sc.nextLine();
		//initiates new Car object
		Car car = new Car(p, i, e, t);
		//prints info about car
		System.out.println("\nYour vehicle is ready......");
		System.out.printf("Paint: %s\nInterior: %s\nEngine: %s\nTires: %s\n", car.getPaint(), car.getInterior(), car.getEngine(), car.getTires());
	}
}