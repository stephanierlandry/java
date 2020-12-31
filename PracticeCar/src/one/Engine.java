package one;

public class Engine extends CarPart {
	
	int oilAmt;
	
	
	public Engine () {
		super(25, "engine");
		this.oilAmt = 31;
	}
	
	public void function(int oilAmt) {
		System.out.println("If you give me " + this.oilAmt + " quarts of I will make the car go.");
		status(this.condition, this.partName);
	}

}
