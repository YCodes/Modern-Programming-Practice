package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Buildings {
	
	private int buildingID;
	List<Apartments> apt; // Each buildings has apartments.
	
	Buildings(int buildingID){
		this.buildingID = buildingID;
		apt = new ArrayList<Apartments>();
	}
	
	public void addApartment(Apartments newApt){
		apt.add(newApt);
	}
	
	public List<Apartments> getApartment(){
		return apt;
	}

	// Since each building generates the profit which is the sum of rent from all apartments. 
	public int calculateProfit(){
		int profit = 0;
		for(Apartments aptRent : apt){
			profit += aptRent.getRent();
		}	
		return profit;
	}
}
