package one;

public class Wheels extends CarPart {
	
	int psi;
	
	public Wheels (int psi) {
		this.psi = psi;
	}
		
	@Override
	public void function(int psi) {
		System.out.println("My function is to move the car if my " + psi + " is correct");
	}

}
