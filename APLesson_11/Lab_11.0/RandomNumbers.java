public class RandomNumbers
{
	public static void main(String[]args)
	{
		//creates array nums
		int[][] nums = new int[4][4];
		//fills array
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random()*100)+1;
			}
		}
		//prints array
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j< nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}