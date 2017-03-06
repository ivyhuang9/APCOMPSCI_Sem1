public class GMC implements Location
{
	private double x, y;
	private int ID;
	
	public GMC(double x, double y){
		this.x = x;
		this.y = y;
	}
	public int getID(){
		if(ID == 0){
			ID = (int)(Math.random()*1000000) + 1;
		}
		return ID;
	}
	public void move(double x, double y){
		this.x += x;
		this.y += y;
	}
	public double[] getLoc(){
		double[] location = {x, y};
		return location;
	}
}