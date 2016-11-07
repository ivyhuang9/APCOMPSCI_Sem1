import java.util.Scanner;

public class Underscores
{
	public static String replace(String sent)
	{
		int x = sent.indexOf(" ");
		if(x == -1)
		{
			return sent;
		}
		else
		{
			return replace(sent.substring(0,x)+"_" + sent.substring(x+1));
		}
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a sentence: ");
		String sent = sc.nextLine();
		//prints replaced sentence
		System.out.println(replace(sent));
	}
}