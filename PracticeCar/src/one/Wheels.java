package one;

public class Wheels extends CarPart {
	
	int psi;
	
	public Wheels () {
		super(3, "wheel");
		this.psi = 11;
	}
		
	public void function(int psi) {
		System.out.println("My function is to move the car if my " + this.psi + " is correct");
		status(this.condition, this.partName);
	}
	
	

}
