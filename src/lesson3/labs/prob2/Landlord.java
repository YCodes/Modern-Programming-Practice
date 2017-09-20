package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	
	private String name;
	List<Buildings> bld; // Landlord has multiple buildings.
	
	Landlord(String name){
		this.name = name;
		bld = new ArrayList<Buildings>();
	}
	
	public void addBuilding(Buildings newBld){
		bld.add(newBld);
	}
	
	public List<Buildings> getBuildings(){
		return bld;
	}
	
	// Landlord total profit will be total profit from each buildings.
	public int calculateTotalProfit(){
		int totalProfit = 0;
		for(Buildings bldProfit :  bld){
			totalProfit += bldProfit.calculateProfit();
		}
		return totalProfit;
	}
	
}
