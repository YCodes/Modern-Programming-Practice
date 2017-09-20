package lesson3.labs.prob2_alternative;

public class Apartments {
	private int rent; // Apartment has rent.
	private Buildings bld;
	
	Apartments(int rent){
		this.rent = rent;
	}
	
	public int getRent(){
		return rent;
	}
	
	public void setRent(int rent){
		this.rent = rent;
	}
	
	public void setBuilding(Buildings bld){
		this.bld = bld;
	}
	
	public String toString(){
		return 	" Landlord Name: " + this.bld.getLandlord().getName() +
				"\n Apartment - Building ID: " + this.bld.getBuildingID() + 
				" \n Rent: " + getRent() + "\n -------------" + bld.toString();
	}

}
