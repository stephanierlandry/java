package one;

import java.util.ArrayList;


public class Car {
	
	Wheels wheels = new Wheels(31);
	Engine engine = new Engine(31, "synthetic");
	Battery battery = new Battery("AA");
	
	public ArrayList<CarPart> carPartsArr = new ArrayList<>();
	
	public Car() {
		this.carPartsArr.add(wheels);
		this.carPartsArr.add(engine);
		this.carPartsArr.add(battery);
	}
	
	public void run() {	    
		for (int i = 0; i < carPartsArr.size(); i++) {	
			carPartsArr.get(i).function();
		}
	}
	
//	wheels.function(31);
//	engine.function(3, "synthetic oil");
//	battery.function("AA");
	

}
