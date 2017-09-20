package lesson5.labs.prob2;

public final class Rectangle implements Figure {
	private final double width;
	private final double length;
	
	public Rectangle(double width, double length){
		this.length = length;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	public double computeArea(){
		return width * length;
	}
	
}
