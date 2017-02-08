import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore(){
		this.toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String toys){
		this.toyList = new ArrayList<Toy>();
		loadToys(toys);
	}
	
	public void loadToys(String ts){
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2){
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy ty = getThatToy(name);
			if(ty == null){
				if(type.equals("Car")){
					toyList.add(new Car(name));
				}
				else{
					toyList.add(new AFigure(name));
				}
			}
			else{
				for(Toy t : toyList){
					if(name.equals(t.getName())){
						t.setCount(t.getCount()+1);
						break;
					}
				}
			}
		}
	}
	
	public Toy getThatToy(String nm){
		if(toyList!=null){
			for(Toy toy : toyList){
				if(toy.getName().equals(nm)){
					return toy;
				}
			}
		}
		return null;
	}
	
	public String getMostFrequentToy(){
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy toy : toyList){
			if(max < toy.getCount()){
				max = toy.getCount();
				name = toy.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType(){
		int cars = 0;
		int figures = 0;
		for(Toy toy : toyList){
			if(toy.getType().equals("Car")){
				cars++;
			}
			if(toy.getType().equals("AF")){
				figures++;
			}
		}
		if(cars > figures){
			return "Cars";
		}
		else if(figures > cars){
			return "Action Figures";
		}
		else{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString(){
		String output = "";
		for(Toy ty : toyList){
			output += ty.toString() + "\n";
		}
		return output;
	}
}