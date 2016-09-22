import java.util.Scanner;

public class SubwooferBox
{
	public double calcVol(double h, double l, double w)
	{
		double vol = h*l*w;
		vol = vol/(1728);
		return vol;
	}
	
	public static void main(String[]args)
	{
		//creates Subwooferbox sb and Scanner sc
		SubwooferBox sb = new SubwooferBox();
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter height: ");
		double h = sc.nextDouble();
		System.out.print("Enter length: ");
		double l = sc.nextDouble();
		System.out.print("Enter width: ");
		double w = sc.nextDouble();
		//gets volume
		double vol = sb.calcVol(h, l, w);
		//prints results
		System.out.println("The volume (in cubic feet) is "+vol+".");
	}
}