import java.util.Scanner;

public class ReverseTriangle
{
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a word: ");
		String word = sc.next();
		//prints the reverse triangle
		for(int i = word.length(); i > 0; i--)
		{
			System.out.println(word.substring(0,i));
		}
	}
}