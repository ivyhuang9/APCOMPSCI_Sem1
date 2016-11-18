public class BiggestNumber
{
	static int[] numbers;
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray()
	{
		for(int number : numbers)
		{
			System.out.print(number + " ");
		}
	}
	public static int getBiggest()
	{
		int max = 0;
		for(int number : numbers)
		{
			if(number > max)
			{
				max = number;
			}
		}
		return max;
	}
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.print("For the following numbers... ");
		printArray();
		System.out.print("\nThe biggest number is " + getBiggest());
	}
}