import java.util.Scanner;

public class ReverseWord
{
	public static void reverse(String[] array)
	{
		System.out.print("In reverse... ");
		for(int i = array.length-1; i >=0; i--)
		{
			System.out.print(array[i] + " ");
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
		//prints words in order
		System.out.print("In order... ");
		for(String word : words)
		{
			System.out.print(word + " ");
		}
		System.out.println();
		//prints words in reverse
		reverse(words);
	}
}