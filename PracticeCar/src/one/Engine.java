package one;

public class Engine extends CarPart {
	
	int oilAmt;
	
	
	public Engine () {
		super(25, "engine");
		this.oilAmt = 31;
	}
	
	public void function(int oilAmt) {
		status(this.condition, this.partName);
		System.out.println("If you give me " + this.oilAmt + " quarts of synthetic oil I will make the car go.");	
	}
}
