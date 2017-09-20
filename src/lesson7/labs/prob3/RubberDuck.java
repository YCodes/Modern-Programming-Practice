package lesson7.labs.prob3;

public class RubberDuck extends Duck{
	
	@Override
	public void display(){
		System.out.println("\n"+ getClass().getSimpleName() + ":");
	}
	
	@Override
	public void fly(){
		System.out.println("Cannot Fly");
	}
	
	@Override
	public void quack(){
		System.out.println("Squeaking");
	}
}
