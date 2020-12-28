package model;

public class AwesomePerson extends Person {
	
	public AwesomePerson() {
		this.name = "Stephanie";
		this.age = 32;
	}
	
	public void talk() {
		System.out.println("My name is " + name + " and my age is " + age + ".");
	}
}
