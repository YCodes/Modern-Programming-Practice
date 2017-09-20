package lesson3.labs.prob2_alternative;

import java.util.ArrayList;
import java.util.List;

public class Buildings {
	
	private int buildingID;
	private List<Apartments> apt; // Each buildings has apartments.
	private Landlord landlord;
	
	// To create new building
	Buildings(int buildingID){
		this.buildingID = buildingID;
		apt = new ArrayList<Apartments>();
	}
	
	// To add new apartment
	public void addApartment(Apartments newApt){
		apt.add(newApt);
	}
	
	// To set the landlord of the building
	public void setLandlord(Landlord landlord){
		this.landlord = landlord;
	}
	
	// To set the apartments to this building.
	public void setApartments(List<Apartments> apartment){
		this.apt = apartment;
	}
	
	// Returns the list of apartments
	public List<Apartments> getApartment(){
		return apt;
	}
	
	public int getBuildingID(){
		return buildingID;
	}
	
	public Landlord getLandlord(){
		return landlord;
	}

	// Since each building generates the profit which is the sum of rent from all apartments. 
	public int calculateProfit(){
		int profit = 0;
		for(Apartments aptRent : apt){
			profit += aptRent.getRent();
		}	
		return profit;
	}
	
	public String toString(){
		return "\n Building ID: " + this.buildingID + " Landlord: " + this.landlord.getName();
	}
}
