import java.util.Scanner;

public class Receipt
{
	public static double discount(double subtotal)
	{
		if(subtotal >= 2000)
		{
			return .15*subtotal;
		}
			return 0;
	}
	public static void format(String word, double num)
	{
		System.out.printf("*%14s ........%10.2f\n",word,num);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes input for 4 items and their prices
		System.out.print("Enter item 1: ");
		String i1 = sc.nextLine();
		System.out.print("Enter price of item 1: ");
		double p1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter item 2: ");
		String i2 = sc.nextLine();
		System.out.print("Enter price of item 2: ");
		double p2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter item 3: ");
		String i3 = sc.nextLine();
		System.out.print("Enter price of item 3: ");
		double p3 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter item 4: ");
		String i4 = sc.nextLine();
		System.out.print("Enter price of item 4: ");
		double p4 = sc.nextDouble();
		sc.nextLine();
		//calculates subtotal
		double subtotal = p1+p2+p3+p4;
		//gets discount
		double discount = discount(subtotal);
		//calculates tax and total
		double tax = subtotal*0.07;
		double total = subtotal - discount + tax;
		//prints receipt
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		format(i1,p1);
		format(i2,p2);
		format(i3,p3);
		format(i4,p4);
		format("Subtotal:",subtotal);
		format("Discount:",discount);
		format("Tax:",tax);
		format("Total:",total);
		System.out.println("__________________________________");
		System.out.println(" * Thank you for your support *");
	}
}