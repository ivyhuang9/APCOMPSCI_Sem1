import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args){
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user inputs
		System.out.print("Enter hair color: ");
		String h = sc.next();
		System.out.print("Enter eye color: ");
		String e = sc.next();
		System.out.print("Enter skin color: ");
		String s = sc.next();
		//creates Human object
		Human ob = new Human(h, e, s);
		//prints info
		System.out.println("\nMy info...");
		System.out.printf("Hair: %s\nEyes: %s\nSkin: %s\n\n", ob.getHair(), ob.getEyes(), ob.getSkin());
		
		//takes user inputs again
		System.out.print("Enter hair color: ");
		h = sc.next();
		System.out.print("Enter eye color: ");
		e = sc.next();
		System.out.print("Enter skin color: ");
		s = sc.next();
		//uses modifier
		ob.setHES(h, e, s);
		//prints info
		System.out.println("\nFriend's info...");
		System.out.printf("Hair: %s\nEyes: %s\nSkin: %s\n\n", ob.getHair(), ob.getEyes(), ob.getSkin());
	}
}