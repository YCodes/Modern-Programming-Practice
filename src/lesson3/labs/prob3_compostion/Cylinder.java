package lesson3.labs.prob3_compostion;

public class Cylinder {
	private double height;
	private Circle circle;
	
	Cylinder(){
		height = 1.0;
	}
	
	Cylinder(double radius){
		circle.setRadius(radius);
	}
	
	Cylinder(double radius, double height){
		circle.setRadius(radius);
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getVolume(){
		return circle.getArea() * height;
	}
	
	public String toString(){
		return "Height: "+ getHeight() +  " || Volume of Cylinder: " + getVolume();
	}

}
