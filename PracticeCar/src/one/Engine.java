package one;

public class Engine extends CarPart {
	
	int oilAmt;
	
	
	public Engine (int oilAmt) {
		this.oilAmt = oilAmt;
	}
	
	@Override
	public void function(int oilAmt) {
		System.out.println("If you give me " + oilAmt + " quarts of I will make the car go.");
	}

}
