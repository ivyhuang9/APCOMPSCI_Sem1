import java.util.Scanner;

public class AdventureGame
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Choose A to go left to the sea or B to go right to the forest: ");
    String c1 = sc.next();
    if(c1.equals("A")){
      System.out.print("Choose A to ride a dolphin or B to continue walking: ");
      String c2 = sc.next();
      if(c2.equals("A")){
        System.out.print("Choose A to attempt to ride the dolphin by hanging on to it or B to give it up: ");
        String c3 = sc.next();
        if(c3.equals("A")){
          System.out.println("You hang on to the dolphin as it swims farther and farther into the ocean, and you eventually slip off and drown.");
        }
        else{
          System.out.println("You stand up and walk towards shore. You find a Magikarp on Pokemon Go. Congrats.");
        }
      }
      else{
        System.out.print("Choose A to hunt for fish in the ocean or B to continue walking: ");
        String c3 = sc.next();
        if(c3.equals("A")){
          System.out.println("You attempt to hunt for fish using your knife and are unsuccessful in your attempts. You keep on trying, but you eventually starve to death.");
        }
        else{
          System.out.println("You wake up from your dream. You groan because you really don't want to go to school as you haven't finished your homework yet.");
        }
      }
    }
    else{
      System.out.print("Choose A to approach the dragon or B to continue walking: ");
      String c2 = sc.next();
      if(c2.equals("A")){
        System.out.print("Choose A to pet the dragon or B to stare at the dragon until it wakes up: ");
        String c3 = sc.next();
        if(c3.equals("A")){
          System.out.println("Congrats! You have befriended the dragon. It can take you anywhere you would like and aid you in your battles.");
        }
        else{
          System.out.println("The dragon wakes up. It notices you staring at it. It blows fire at you to show you who's boss. You die.");
        }
      }
      else{
        System.out.print("An archer riding a chicken runs towards you. Choose A to run towards them or B to run away: ");
        String c3 = sc.next();
        if(c3.equals("A")){
          System.out.println("You run towards the archer and the chicken. The chicken looks especially fierce up close. The archer high fives you and gives you ramen.");
        }
        else{
          System.out.println("You scream as you run away. The archer thinks that you are afraid of the chicken's almighty power and sadly leads the chicken away.");
        }
      }
    }
  }
}