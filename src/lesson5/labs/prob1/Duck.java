package lesson5.labs.prob1;

public abstract class Duck {
	
	
	public void display(){
		System.out.println("Displaying");
	}
	
	public void swim(){
		System.out.println("Swimming");
	}
	
	abstract void fly();
	
	abstract void quack();
}
