package lode;

import java.util.ArrayList;

public class Fleet {
	Cruiser c = new Cruiser("Cruiser", 10, 3, 5, 2);
	
	Heavy h = new Heavy("Heavy", 2, 6, 15, 10);
	
	 int maxHeavy;
	 int maxCruiser;
	
	ArrayList<Ship> fleet= new ArrayList<Ship>();
	
	public void addShip(String t) {
		if(t == "H") {
			if(maxHeavy <= 3) {
				fleet.add(h);
				maxHeavy++;
			}
		}
		
		if(t == "C") {
			if(maxCruiser <= 10) {
				fleet.add(c);
				maxCruiser++;
			}
		}
	}

	@Override
	public String toString() {
		return "Fleet: " + fleet + "";
	}
	
	

}
