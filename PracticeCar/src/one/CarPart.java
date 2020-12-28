package one;

public class CarPart implements Functional {
	
	int condition;
	String statusMessage;
	
	public void status(String statusMessage) {
		System.out.println(statusMessage);
	}

	@Override
	public void function() {
		System.out.println("carpart");
		// TODO Auto-generated method stub
	}
	
	

}
