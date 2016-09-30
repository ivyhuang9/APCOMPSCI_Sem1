import java.util.Scanner;

public class Receipt
{
	public void format(String item, double price)
	{
		//prints receipt
		System.out.printf("*%17s ........%10.2f\n",item,price);
	}
	public static void main(String[]args)
	{
		//creates Scanner sc and Receipt r
		Scanner sc = new Scanner(System.in);
		Receipt r = new Receipt();
		//asks user for input
		System.out.println("Please enter item 1:");
		String i1 = sc.nextLine();
		System.out.println("Please enter the price:");
		double p1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Please enter item 2:");
		String i2 = sc.nextLine();
		System.out.println("Please enter the price:");
		double p2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Please enter item 3:");
		String i3 = sc.nextLine();
		System.out.println("Please enter the price:");
		double p3 = sc.nextDouble();
		sc.nextLine();
		//calculates the subtotal, tax, and total
		double sub = p1+p2+p3;
		double tax = sub*0.07;
		double tot = sub+tax;
		//prints receipt based on inputs
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n\n");
		r.format(i1,p1);
		r.format(i2,p2);
		r.format(i3,p3);
		System.out.println("\n");
		r.format("Subtotal:",sub);
		r.format("Tax:",tax);
		r.format("Total:",tot);
		System.out.println("__________________________________________");
		System.out.println(" * Thank you for your support *");
	}
}