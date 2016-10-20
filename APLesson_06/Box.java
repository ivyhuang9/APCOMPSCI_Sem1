import java.util.Scanner;

public class Box
{
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a word: ");
		String word = sc.next();
		//prints the word in a box pattern
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
	}
}