import java.util.Scanner;

public class FindTheZs
{
	static String[] words;
	
	public static void fillArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = sc.next();
		}
	}
	public static void printArray()
	{
		for(String word : words)
		{
			System.out.print(word + " ");
		}
	}
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") != -1)
			{
				zs += word + " ";
			}
		}
		return zs;
	}
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		System.out.print("For the words ");
		printArray();
		System.out.print("\nOnly " + hasZs() + "contain(s) the letter z.");
	}
}