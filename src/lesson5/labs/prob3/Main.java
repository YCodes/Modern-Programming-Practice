package lesson5.labs.prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bus = VehicleFactory.getVehicle("bus");
		bus.startEngine();
		
		VehicleFactory.getVehicle("electric car").startEngine();
		
		Vehicle truck = VehicleFactory.getVehicle("truck");
		truck.startEngine();
		
		VehicleFactory.getVehicle("car").startEngine();
	}

}
