package one;

import java.util.ArrayList;


public class Car {
	
	Wheels wheels = new Wheels();
	Engine engine = new Engine();
	Battery battery = new Battery();
	
	public ArrayList<CarPart> carPartsArr = new ArrayList<>();
	
	public Car() {
		this.carPartsArr.add(wheels);
		this.carPartsArr.add(engine);
		this.carPartsArr.add(battery);
	}
	
	public void run() {	    
		for (int i = 0; i < carPartsArr.size(); i++) {	
			carPartsArr.get(i).function(wheels.psi);	
		}
	}
}
