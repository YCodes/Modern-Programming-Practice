package lesson7.labs.prob3;

public abstract class Duck implements FlyBehavior, QuackBehavior{
	public void swim(){
		System.out.println("Swimming");
	}
	
	public abstract void display();
}
