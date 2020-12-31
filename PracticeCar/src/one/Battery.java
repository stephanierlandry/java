package one;

public class Battery extends CarPart {

	int batteryType;
	
	public Battery () {
		super(80, "battery");
		this.batteryType = 12;
	}
	
	public void function(int batteryType) {
		System.out.println("I need a " + this.batteryType + " to start the car.");
		status(this.condition, this.partName);
	}
}
