package one;

public class Application {
	
	public static void main(String[] args) {
		
		MyObject mo1 = new MyObject(123L);
		MyObject mo2 = new MyObject(123L);
		
		if (mo1.equals(mo2)) {
			System.out.println("The ids are equal");
		} else {
			System.out.println("The ids are not equal");
		}
	}

}
