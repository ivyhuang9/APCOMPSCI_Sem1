public class ToyRunner
{
	public static void main(String[]args){
		AFigure af = new AFigure("action figure");
		Car c = new Car("car");
		
		System.out.println(af + "\n" + c);
	}
}