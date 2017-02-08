public class GameRunner
{
	public static void main(String[]args){
		GameSystem xb = new XBox();
		GameSystem ps = new PlayStation();
		PC p = new PC();
		
		System.out.println(xb);
		System.out.println(ps);
		System.out.println(p);
	}
}