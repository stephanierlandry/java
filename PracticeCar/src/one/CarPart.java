package one;

public class CarPart implements Functional {
	
	int condition;
	String partName;
	
	public CarPart (int condition, String partName) {
		this.condition = condition;
		this.partName = partName;
	}
	
	
	public void status(int condition, String partName) {
		System.out.println("Your " + this.partName + " is in " + this.condition + " out of 100 condition.");
	}
	
	public void function() {
		System.out.println("carpart");
		// TODO Auto-generated method stub
	}


	@Override
	public void function(int psi) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void function(String batteryType) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void function(int oilAmt, String oilType) {
		// TODO Auto-generated method stub	
	}

	
	

}
