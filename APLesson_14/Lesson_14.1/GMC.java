public class GMC extends Car
{
	private double locX, locY;
	private int ID;
	
	public GMC(){
		locX = 0;
		locY = 0;
		ID = (int)(Math.random()*1000000) + 1;
	}
	public GMC(double x, double y){
		locX = x;
		locY = y;
		ID = (int)(Math.random()*1000000) + 1;
	}
	public void move(double x, double y){
		locX += x;
		locY += y;
	}
	public int getID(){
		return ID;
	}
	public double[] getLoc(){
		double[] location = {locX, locY};
		return location;
	}
}