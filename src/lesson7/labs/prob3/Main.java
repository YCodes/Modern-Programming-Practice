package lesson7.labs.prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks = {new DecoyDuck(), new MallardDuck(), new RedheadDuck(), new RubberDuck()};
		for(Duck d: ducks){
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}

}
