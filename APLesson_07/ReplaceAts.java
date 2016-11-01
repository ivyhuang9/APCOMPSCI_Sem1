import java.util.Scanner;

public class ReplaceAts
{
	public static String replace(String sentence)
	{
		while(sentence.indexOf("a") != -1)
		{
			int x = sentence.indexOf("a");
			sentence = sentence.substring(0,x) + "@" + sentence.substring(x+1);
		}
		return sentence;
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		//prints replaced sentence
		System.out.print(replace(sentence)+"\n");
	}
}