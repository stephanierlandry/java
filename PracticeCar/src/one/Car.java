package one;

import java.util.ArrayList;


public class Car {
	
	Wheels wheels = new Wheels(31);
	Engine engine = new Engine(21);
	Battery battery = new Battery(11);
	
	public ArrayList<CarPart> carPartsArr = new ArrayList<>();
	
	public Car() {
		this.carPartsArr.add(wheels);
		this.carPartsArr.add(engine);
		this.carPartsArr.add(battery);
	}
	
	public void run() {	    
		for (int i = 0; i < carPartsArr.size(); i++) {	
			carPartsArr.get(i).function(31);	
		}
	}
	
//	wheels.function(31);
//	engine.function(3, "synthetic oil");
//	battery.function("AA");
	

}
