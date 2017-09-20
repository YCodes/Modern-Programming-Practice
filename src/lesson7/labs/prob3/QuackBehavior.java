package lesson7.labs.prob3;

public interface QuackBehavior {
	public default void quack(){
		System.out.println("Quacking");
	}

}
