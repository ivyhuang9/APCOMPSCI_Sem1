import java.util.Scanner;

public class GPACalc
{
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		return 0.0;
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user inputs
		System.out.print("Enter first grade: ");
		String g1 = sc.next();
		System.out.print("Enter second grade: ");
		String g2 = sc.next();
		System.out.print("Enter third grade: ");
		String g3 = sc.next();
		System.out.print("Enter fourth grade: ");
		String g4 = sc.next();
		System.out.print("Enter fifth grade: ");
		String g5 = sc.next();
		System.out.print("Enter sixth grade: ");
		String g6 = sc.next();
		System.out.print("Enter seventh grade: ");
		String g7 = sc.next();
		//calculates sum
		double total = calcPoints(g1)+calcPoints(g2)+calcPoints(g3)+calcPoints(g4)+calcPoints(g5)+calcPoints(g6)+calcPoints(g7);
		//prints GPA
		System.out.printf("Your GPA is %.2f",total/7);
	}
}