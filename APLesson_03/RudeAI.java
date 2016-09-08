import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		//creates Scanner named sc
		Scanner sc = new Scanner(System.in);
		//asks name and responds
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println(name+"?!!! Why would anyone name a baby that?");
		//asks age and responds
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("Oooooo!!! "+age+" is getting up there.");
		//asks what done for fun and responds
		System.out.println("What do you do for fun?");
		String fun = sc.next();
		System.out.println("I thought only nerds like to "+fun+"?");
		//asks music liked and responds
		System.out.println("What kind of music do you like?");
		String music = sc.next();
		System.out.println("Boooo!!! I wouldn't wish the sound of "+music+" on my worst enemy.");
		//asks # siblings and responds
		System.out.println("How many siblings do you have?");
		int sib = sc.nextInt();
		System.out.println(sib+"? Wow, I hope the rest of your family is better looking.");
		//asks what want to be in future and responds
		System.out.println("What do you want to be when you grow up?");
		String future = sc.next();
		System.out.println("I think you'd have to be smarter to be a "+future+".");
		//restates info
		System.out.println("So "+name+", you're "+age+"...");
		System.out.println("You like to "+fun+" and listen to "+music+"...");
		System.out.println("Good luck becoming a "+future+".");
		System.out.println("I'm only kiddin' "+name+".");
	}
}