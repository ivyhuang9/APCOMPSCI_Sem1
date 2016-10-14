import java.util.Random;

public class Dice
{
	public static String rollDice(int pr, int cr)
	{
		if(pr > cr)
		{
			return "you";
		}
		if(cr > pr)
		{
			return "computer";
		}
		return "neither";
	}
	public static void main(String[]args)
	{
		//creates Random object named rand
		Random rand = new Random();
		//sets the roll for the player and computer
		int playerRoll = rand.nextInt(6) + 1;
		int compRoll = rand.nextInt(6) + 1;
		//runs the rollDice method
		String winner = rollDice(playerRoll,compRoll);
		//prints the rolls and the winner
		System.out.println("You rolled a " + playerRoll + ".");
		System.out.println("Computer rolled a " + compRoll + ".");
		System.out.println("The winner is " + winner + ".");
	}
}