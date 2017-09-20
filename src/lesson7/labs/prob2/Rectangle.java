package lesson7.labs.prob2;

public class Rectangle implements Polygon{
	public double length, width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double[] getSides(){
		double[] ab = {length, width};
		return ab;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * length + 2 * width;
	}

}
