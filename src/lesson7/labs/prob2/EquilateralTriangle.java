package lesson7.labs.prob2;

public class EquilateralTriangle implements Polygon {
	
	public double side;
	
	public EquilateralTriangle(double side){
		this.side = side;
	}

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return new double[]{side,side,side};
	}

}
