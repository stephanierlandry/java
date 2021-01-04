package one;

public class Wheels extends CarPart {
	
	int psi;
	
	public Wheels () {
		super(3, "wheel");
		this.psi = 44;
	}
		
	public void function(int psi) {
		status(this.condition, this.partName);
		System.out.println("My function is to move the car if my psi (" + this.psi + ") is correct");
	}
}
