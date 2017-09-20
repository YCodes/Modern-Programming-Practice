package lesson3.labs.prob2_alternative;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	
	private String name;
	private List<Buildings> bld; // Landlord has multiple buildings.
	
	// To create landlord.
	Landlord(String name){
		this.name = name;
		bld = new ArrayList<Buildings>();
	}
	
	// To add new buildings.
	public void addBuilding(Buildings newBld){
		bld.add(newBld);
	}
	
	// To set the building to the landlord.
	public void setBuilding(List<Buildings> newBld){
		this.bld = newBld;
	}
	
	// Returns the list of buildings.
	public List<Buildings> getBuildings(){
		return bld;
	}
	
	public String getName(){
		return name;
	}
	
	// Landlord total profit will be total profit from each buildings.
	public int calculateTotalProfit(){
		int totalProfit = 0;
		for(Buildings bldProfit :  bld){
			totalProfit += bldProfit.calculateProfit();
		}
		return totalProfit;
	}
	
	public String toString(){
		return "\n Landlord Name: " + name;
	}
	
}
