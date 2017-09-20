package lesson3.labs.prob3_inheritance;

public class Circle {
	private double radius;
	private String color;
	
	Circle(){
		radius = 1.0;
		color = "Red";
	}
	
	Circle(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString(){
		return "Radius: "+ getRadius() +  " || Color: " + this.color + " || Area of Square: " + getArea();
	}
}
