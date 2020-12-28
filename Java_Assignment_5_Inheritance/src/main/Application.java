package main;

import model.AwesomePerson;
import model.ReallyAwesomePerson;

public class Application {
	
	public static void main(String[] args) {
		AwesomePerson s = new AwesomePerson ();
		s.talk();
		
		ReallyAwesomePerson g = new ReallyAwesomePerson();
		g.talk("Here I am");
	}
}
