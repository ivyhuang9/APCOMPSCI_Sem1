import java.util.Scanner;
public class GameHealth
{
	static String[] health;
	static int HEALTHLOAD = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		//runs game
		while(!turn.equals("Q") && healthCount > 0)
		{
			System.out.print("Your turn! Hit Enter when ready: ");
			turn = sc.nextLine();
			damage = (int)(Math.random()*2) + 1;
			amount = (int)(Math.random()*6) + 1;
			System.out.println(takeDamage(damage,amount));
			printClip();
			System.out.println();
		}
		System.out.println("You died!!!");
	}
	public static String takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthCount -= amt;
			return "Taking " + amt + " damage!";
		}
		else
		{
			if(healthCount + amt < HEALTHLOAD)
			{
				healthCount += amt;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
			return "Power Up " + amt + "!";
		}
	}
	public static void printClip()
	{
		String output = "Health: ";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}