public class Honda extends Car
{
	private double[] location;
	private int ID;
	
	public Honda(){
		ID = (int)(Math.random()*1000000) + 1;
	}
	public Honda(double[] loc){
		location = loc;
		ID = (int)(Math.random()*1000000) + 1;
	}
	public void move(double x, double y){
		location[0] += x;
		location[1] += y;
	}
	public int getID(){
		return ID;
	}
	public double[] getLoc(){
		return location;
	}
}