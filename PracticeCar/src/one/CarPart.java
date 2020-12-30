package one;

public class CarPart implements Functional {
	
	int condition;
	String statusMessage;
	
	public void status(String statusMessage) {
		System.out.println(statusMessage);
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
