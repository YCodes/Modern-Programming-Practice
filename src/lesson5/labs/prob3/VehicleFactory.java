package lesson5.labs.prob3;

public class VehicleFactory {
	public static Vehicle getVehicle(String v){
		if(v.equalsIgnoreCase("bus")){
			return new Bus();
		}
		else if(v.equals("truck")){
			return new Truck();
		}
		else if(v.equals("car")){
			return new Car();
		}
		else if(v.equals("electric car")){
			return new ElectricCar();
		}
		return null;
	}	
}
