import java.util.Scanner;

public class Divisor
{
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//creates array nums
		int[][] nums = new int[4][4];
		//fills array
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random()*100)+1;
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		//sets divisor to user input
		System.out.print("Please enter a number: ");
		int divisor = sc.nextInt();
		//finds number of numbers in array divisible by divisor
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
		System.out.printf("There are %d numbers divisible by %d in the array.", count, divisor);
	}
}