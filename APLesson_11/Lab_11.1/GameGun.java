import java.util.Scanner;

public class GameGun
{
	static int bulletCount, shotCount;
	static int CLIPSIZE = 16;
	static String[] clip;
	
	public static void main(String[]args)
	{
		//creates Scanner sc
		Scanner sc = new Scanner(System.in);
		//initializes several variables
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		resetClip();
		//runs game
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.print("Action: ");
			String action = sc.next();
			if(action.equals("R"))
			{
				reload();
			}
			if(action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();
			System.out.println();
		}
		System.out.println("Out of Bullets!!!");
	}
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			return "Boom!!!";
		}
		else
		{
			return "Reload!!!";
		}
	}
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = "";
		output += "Bullets: " + bulletCount + "\nClip: ";
		for(int i = 0; i < CLIPSIZE; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}