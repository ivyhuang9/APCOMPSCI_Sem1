import java.util.Scanner;
public class UserDriver
{
	public static void main(String[]args){
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user inputs
		System.out.print("Enter first name: ");
		String fN = sc.next();
		System.out.print("Enter last name: ");
		String lN = sc.next();
		System.out.print("Would you like to use a public avatar? (y or n) ");
		if(sc.next().equals("n")){
			User us = new User(fN, lN);
			//prints user info
			System.out.print("\n"+us);
		}
		else{
			System.out.print("Enter avatar: ");
			String a = sc.next();
			User us = new User(fN, lN, a);
			//prints user info
			System.out.print("\n"+us);
		}
	}
}