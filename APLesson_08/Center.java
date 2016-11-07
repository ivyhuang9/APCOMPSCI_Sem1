import java.util.Scanner;

public class Center
{
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
		{
			return word;
		}
		else
		{
			return makeCenter(" " + word + " ");
		}
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user inputs
		System.out.print("Enter the first word: ");
		String w1 = sc.next();
		System.out.print("Enter the second word: ");
		String w2 = sc.next();
		System.out.print("Enter the third word: ");
		String w3 = sc.next();
		//prints the words centered
		System.out.println(makeCenter(w1));
		System.out.println(makeCenter(w2));
		System.out.println(makeCenter(w3));
	}
}