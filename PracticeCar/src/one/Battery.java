package one;

public class Battery extends CarPart {

	String batteryType;
	
	public Battery (String batteryType) {
		this.batteryType = batteryType;
	}
	
	public void function(String batteryType) {
		System.out.println("I need a " + batteryType + " to start the car.");
	}
}
