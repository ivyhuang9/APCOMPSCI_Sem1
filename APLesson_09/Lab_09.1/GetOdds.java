public class GetOdds
{
	static int[] numbers; //creates integer array
	
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
	public static String getOdds()
	{
		String odds = "";
		for(int number : numbers)
		{
			if(number%2 == 1)
			{
				odds += number + " ";
			}
		}
		return odds;
	}
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.print("For the following numbers... ");
		printArray();
		System.out.println("\n" + getOdds() + "are odd numbers");
	}
}