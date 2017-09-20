package lesson7.labs.prob3;

public class DecoyDuck extends Duck{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\n"+ getClass().getSimpleName() + ":");
	}
	
	@Override
	public void  quack(){
		System.out.println("Mute Quack");
	}
	
	@Override
	public void  fly(){
		System.out.println("Cannot Fly");
	}

}
