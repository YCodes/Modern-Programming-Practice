package lesson5.labs.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Figure> inputObjects= new ArrayList<>();
		
		Figure r1 = new Rectangle(5,6);
		Figure r2 = new Rectangle(5,10);
		Figure r3 = new Rectangle(15,6);
		
		Figure c1 = new Circle(25);
		Figure c2 = new Circle(15);
		Figure c3 = new Circle(20);
		
		Figure t1 = new Triangle(10,5);
		Figure t2 = new Triangle(20,15);
		
		inputObjects.addAll(Arrays.asList(r1,c1,t1 , r2, r3, t2, c1, c2 , c3));
		
		double sumOfAreas = 0;
		
		for(Figure ob : inputObjects){
			sumOfAreas += ob.computeArea();
		}
		
		System.out.println("Sum of Areas: " + sumOfAreas);

	}

}
