public class Toyota implements Location
{
	private double[] location;
	private int ID;
	
	public Toyota(String coords){
		String[] c = coords.split(", ");
		location = new double[2];
		for(int i = 0; i < 2; i++){
			location[i] = Double.parseDouble(c[i]);
		}
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