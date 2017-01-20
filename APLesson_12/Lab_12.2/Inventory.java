public class Inventory
{
	private String manufacturer, name, category;
	private int upc;
	private double price;
	
	public Inventory(String m, String n){
		manufacturer = m;
		name = n;
		upc = (int)(Math.random()*1000000000)+1;
	}
	public Inventory(String m, String n, String c, double p){
		manufacturer = m;
		name = n;
		category = c;
		price = p;
		upc = (int)(Math.random()*1000000000)+1;
	}
	public String toString(){
		return "Item manufacturer: " + manufacturer +
				"\nItem name: " + name +
				"\nItem category: " + category +
				"\nUPC #: " + upc +
				"\nItem price: " + price;
	}
}