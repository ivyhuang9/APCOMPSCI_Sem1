public class Toyota extends Car
{
	private double[] location = new double[2];
	private int ID;
	
	public Toyota(){
		ID = (int)(Math.random()*1000000) + 1;
	}
	public Toyota(String coords){
		String[] c = coords.split(", ");
		for(int i = 0; i < 2; i++){
			location[i] = Double.parseDouble(c[i]);
		}
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