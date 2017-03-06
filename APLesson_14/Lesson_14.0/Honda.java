public class Honda implements Location
{
	private double[] location;
	private int ID;
	
	public Honda(double[] loc){
		location = loc;
	}
	public int getID(){
		if(ID == 0){
			ID = (int)(Math.random()*1000000) + 1;
		}
		return ID;
	}
	public void move(double x, double y){
		location[0] += x;
		location[1] += y;
	}
	public double[] getLoc(){
		return location;
	}
}