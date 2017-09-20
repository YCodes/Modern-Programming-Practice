package lesson5.labs.prob1;

public class DecoyDuck extends Duck {
//	public void display(){
//		System.out.println("\n Decoy Duck:");
//	}
	
	FlyBehavior fww = new CannotFly();
	QuackBehavior qb = new MuteQuack();
	
	public void fly(){
		fww.fly();
	}
	
	public void quack(){
		qb.quack();
	}
}
