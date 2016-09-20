import java.util.Scanner;

public class Receipt
{
	public void format(String i1,String i2,String i3,double p1,double p2,double p3)
	{
		//calculates the subtotal, tax, and total
		double sub = p1+p2+p3;
		double tax = sub*0.7;
		double tot = sub+tax;
		//prints receipt
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n\n");
		System.out.printf("*%17s ........%10.2f\n",i1,p1);
		System.out.printf("*%17s ........%10.2f\n",i2,p2);
		System.out.printf("*%17s ........%10.2f\n\n\n",i3,p3);
		System.out.printf("*%17s ........%10.2f\n","Subtotal:",sub);
		System.out.printf("*%17s ........%10.2f\n","Tax:",tax);
		System.out.printf("*%17s ........%10.2f\n","Total:",tot);
		System.out.println("__________________________________________");
		System.out.println(" * Thank you for your support *");
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
		//prints receipt based on inputs
		r.format(i1,i2,i3,p1,p2,p3);
	}
}