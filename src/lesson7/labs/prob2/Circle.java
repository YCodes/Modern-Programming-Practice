package lesson7.labs.prob2;

public class Circle implements ClosedCurve {
	public double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double computePerimeter(){
		return 2 * Math.PI * radius;
	}
}
