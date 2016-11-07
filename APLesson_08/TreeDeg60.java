import java.util.Scanner;

public class TreeDeg60
{
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.println(word.substring(0,start));
			start += 1;
			tree(word, start, stop);
		}
	}
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//takes user input
		System.out.print("Enter a word: ");
		String w = sc.next();
		//sets stop variable
		int stop = w.length();
		int start = 1;
		//prints tree
		tree(w,start,stop);
	}
}