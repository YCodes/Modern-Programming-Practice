package lesson3.labs.prob3_inheritance;

public class Cylinder extends Circle{
	private double height;
	
	Cylinder(){
		height = 1.0;
	}
	
	Cylinder(double radius){
		this.height = radius;
	}
	
	Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getVolume(){
		return super.getArea() * height;
	}
	
	public String toString(){
		return "Height: "+ getHeight() +  " || Volume of Cylinder: " + getVolume();
	}

}
