public class PC extends GameSystem
{
	public String systemInput(){
		return "Keyboard and Mouse";
	}
	public String toString(){
		return "Platform: " + super.getPlatform() +
			"\nSerial #: " + super.getSerialNo() +
			"\nSystem Input: " + systemInput();
	}
}