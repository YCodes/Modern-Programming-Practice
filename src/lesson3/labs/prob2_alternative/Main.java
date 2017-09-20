package lesson3.labs.prob2_alternative;

public class Main {

		public static void main(String[] args){
			
			Landlord landlord = new Landlord("Yaman");
			
			
			// Adding apartments a1, a2, a3 to building with id 1.
			
			Buildings b1 = new Buildings(1);
			Apartments a1 =  new Apartments(200);
			b1.addApartment(a1);
			a1.setBuilding(b1);
			
			Apartments a2 =  new Apartments(300);
			b1.addApartment(a2);
			a2.setBuilding(b1);
			
			Apartments a3 =  new Apartments(500);
			b1.addApartment(a3);
			a3.setBuilding(b1);
			

			// Adding apartments a4, a5, a6 to building with id 2.
			Buildings b2 = new Buildings(2);
			
			Apartments a4 =  new Apartments(200);
			b2.addApartment(a4);
			a4.setBuilding(b2);
			
			Apartments a5 =  new Apartments(700);
			b2.addApartment(a5);
			a5.setBuilding(b2);
			
			Apartments a6 =  new Apartments(100);
			b2.addApartment(a6);
			a6.setBuilding(b2);

			// adding the buildings to the landloard
			landlord.addBuilding(b1);
			landlord.addBuilding(b2);
			
			// setting the landlord of the buildings created.
			b1.setLandlord(landlord);
			b2.setLandlord(landlord);
			
			System.out.println(a5);
			System.out.println("\n ---------------- \nTotal landlord profit is " + landlord.calculateTotalProfit());
		}
}
