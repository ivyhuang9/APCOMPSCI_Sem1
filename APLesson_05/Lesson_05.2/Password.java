import java.util.Scanner;

public class Password
{
	public static void passCheck(String username,String password)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String i1 = sc.next();
		System.out.print("Enter password: ");
		String i2 = sc.next();
		if(i1.equals(username) && i2.equals(password))
			System.out.println("You are granted access!");
		else
		{
			if(i1.equals(username))
				System.out.println("Your password is incorrect!");
			else if(i2.equals(password))
				System.out.println("Your username is incorrect!");
			else
				System.out.println("Your username and password are incorrect!");
			passCheck(username,password);
		}
	}
	public static void main(String[]args)
	{
		String username = "username";
		String password = "password";
		passCheck(username,password);
	}
}