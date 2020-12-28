package one;

public class Engine extends CarPart {
	
	int oilAmt;
	String oilType;
	
	public Engine (int oilAmt, String oilType) {
		this.oilAmt = oilAmt;
		this.oilType = oilType;
	}
	
	public void function(int oilAmt, String oilType) {
		System.out.println("If you give me " + oilAmt + " quarts of " + oilType + " I will make the car go.");
	}

}
