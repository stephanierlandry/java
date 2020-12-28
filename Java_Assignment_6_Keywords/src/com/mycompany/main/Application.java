package com.mycompany.main;

public class Application {
	
	public static void main(String[] args) {
		
		float a = 10.5f;
		float b = 11.5f;
		
		System.out.println(StaticClass.addition(a, b));
		
		System.out.println(FinalClass.myConstant);
		
		ConcreteClass cc = new ConcreteClass();
		cc.run();
		
		
	}

}
