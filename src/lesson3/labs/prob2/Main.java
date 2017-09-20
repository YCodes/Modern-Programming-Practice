package lesson3.labs.prob2;

public class Main {

		public static void main(String[] args){
			
			Landlord landlord = new Landlord("Yaman");
			
			
			// Adding apartments a1, a2, a3 to building with id 1.
			
			Buildings b1 = new Buildings(1);
			
			Apartments a1 =  new Apartments(200);
			b1.addApartment(a1);
			
			Apartments a2 =  new Apartments(300);
			b1.addApartment(a2);
			
			Apartments a3 =  new Apartments(500);
			b1.addApartment(a3);
			

			// Adding apartments a4, a5, a6 to building with id 2.
			Buildings b2 = new Buildings(2);
			
			Apartments a4 =  new Apartments(200);
			b2.addApartment(a4);
			
			Apartments a5 =  new Apartments(700);
			b2.addApartment(a5);
			
			Apartments a6 =  new Apartments(100);
			b2.addApartment(a6);

			landlord.addBuilding(b1);
			landlord.addBuilding(b2);
			

			System.out.println("Total landlord profit is " + landlord.calculateTotalProfit());
		}
}
