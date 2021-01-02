package one;

public class Battery extends CarPart {

	int batteryType;
	
	public Battery () {
		super(80, "battery");
		this.batteryType = 12;
	}
	
	public void function(int batteryType) {
		status(this.condition, this.partName);
		System.out.println("I need a " + this.batteryType + " volt battery to start the car.");
	}
}
