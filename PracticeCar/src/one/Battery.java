package one;

public class Battery extends CarPart {

	int batteryType;
	
	public Battery (int batteryType) {
		this.batteryType = batteryType;
	}
	
	@Override
	public void function(int batteryType) {
		System.out.println("I need a " + batteryType + " to start the car.");
	}
}
