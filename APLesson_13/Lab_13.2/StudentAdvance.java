public class StudentAdvance extends Advance
{
	private int daysLeft;
	
	public StudentAdvance(int days){
		daysLeft = days;
	}
	public double getPrice(){
		if(daysLeft >= 10){
			return 15.00;
		}
		else{
			return 20.00;
		}
	}
	public String toString(){
		return "Serial #: " + super.getSerialNo() + "\nPrice: " + getPrice() + "\n(STUDENT ID REQUIRED)";
	}
}