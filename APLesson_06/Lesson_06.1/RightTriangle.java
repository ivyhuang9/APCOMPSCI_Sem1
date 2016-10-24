import java.util.Scanner;

public class RightTriangle
{
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a word: ");
		String word = sc.next();
		//prints a right triangle
		for(int i = word.length()-1; i >= 0; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}