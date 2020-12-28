package two;

public class Application {
	
	public static void main(String[] args) {
		
		PrivatePerson pp = new PrivatePerson(); 
		pp.setName("Deanna");
		pp.setAge(38);
		
		System.out.println("First Name:" + pp.getName() + ", Age:" + pp.getAge());
	}

}
