import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest
{
	public double payment(double r,double p,double n,double t)
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
		double princpl = sc.nextDouble();
		System.out.print("Enter interest rate: ");
		double rate = sc.nextDouble();
		System.out.print("Enter number of times compounded per year: ");
		double number = sc.nextDouble();
		System.out.print("Enter life of loan: ");
		double time = sc.nextDouble();
		//finds total payment amount of loan
		double payment = ci.payment(rate,princpl,number,time);
		//prints total payment amount of loan
		System.out.printf("Your total monthly payment is $%.2f",payment);
	}
}