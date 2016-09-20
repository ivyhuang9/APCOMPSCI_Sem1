import java.util.Scanner;

public class IDCard
{
	public void format(String fst,String sec)
	{
		System.out.printf("* %13s  %16s *\n",fst,sec);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc and IDCard id
		Scanner sc = new Scanner(System.in);
		IDCard id = new IDCard();
		//asks user for input
		System.out.println("Enter your first name:");
		String fn = sc.next();
		System.out.println("Enter your last name:");
		String ln = sc.next();
		System.out.println("Enter your title:");
		String title = sc.next();
		sc.nextLine();
		System.out.println("Enter the school site:");
		String school = sc.nextLine();
		System.out.println("Enter the school year:");
		String year = sc.next();
		sc.nextLine();
		System.out.println("What is your subject?");
		String sub = sc.nextLine();
		//prints ID Card
		System.out.println("***********************************");
		id.format(school,year);
		id.format(fn,ln);
		id.format(title,sub);
		System.out.println("***********************************");
	}
}