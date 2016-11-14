public class AverageNumbers
{
	public static double average(int[] nums)
	{
		double avg = 0;
		for(int num : nums)
		{
			avg += num;
		}
		return avg/nums.length;
	}
	public static void main(String[]args)
	{
		//creates integer array numbers
		int[] numbers = new int[10];
		//fills in array
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
		//prints numbers in array
		System.out.print("Numbers... ");
		for(int number : numbers)
		{
			System.out.print(number + " ");
		}
		System.out.println();
		//prints average of numbers in array
		System.out.print("The average of the above numbers is... " + average(numbers));
	}
}