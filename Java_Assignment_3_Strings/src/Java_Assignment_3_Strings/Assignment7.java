package Java_Assignment_3_Strings;

public class Assignment7 {
	
	public static void main(String[] args) {
		
		String url = "http://example.com?access_token=EFEc8328h29jndjd02h12$3829&ds98d";
		
		System.out.println(url.substring(url.indexOf("=")+1));
	}

}
