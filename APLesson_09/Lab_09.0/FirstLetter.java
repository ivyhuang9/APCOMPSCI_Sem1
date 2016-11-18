import java.util.Scanner;

public class FirstLetter
{
	public static void first(String[] array)
	{
		System.out.print("First letter of each word inputted: ");
		for(String word : array)
		{
			System.out.print(word.charAt(0) + " ");
		}
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//creates array words
		String[] words = new String[5];
		//takes user inputs and puts them into array
		System.out.println("Enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = sc.next();
		}
		//prints first letter of each word
		first(words);
	}
}