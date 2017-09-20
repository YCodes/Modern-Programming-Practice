package lesson5.labs.prob1;

public class RedheadDuck extends Duck{
//	public void display(){
//		System.out.println("\n Redhead Duck:");
//	}
	
	FlyBehavior fww = new FlyWithWings();
	QuackBehavior qb = new Quack();
	
	public void fly(){
		fww.fly();
	}
	
	public void quack(){
		qb.quack();
	}
}
