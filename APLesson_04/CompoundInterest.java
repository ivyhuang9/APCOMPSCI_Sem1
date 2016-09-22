import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest
{
	public double totPay(double r,double p,int n,int t)
	{
		double cost = p*Math.pow(1+r/n,n*t);
		double payment = cost/(t*12);
		return payment;
	}
	
	public static void main(String[]args)
	{
		//creates Scanner sc and CompoundInterest ci
		Scanner sc = new Scanner(System.in);
		CompoundInterest ci = new CompoundInterest();
		//takes user input
		System.out.print("Enter principal: ");
		double p = sc.nextDouble();
		System.out.print("Enter interest rate: ");
		double r = sc.nextDouble();
		System.out.print("Enter number of times compounded per year: ");
		int n = sc.nextInt();
		System.out.print("Enter life of loan: ");
		int t = sc.nextInt();
		//finds total payment amount of loan
		double payment = ci.totPay(r,p,n,t);
		//prints total payment amount of loan
		System.out.printf("Total payment amount of loan is $%.2f",payment);
	}
}