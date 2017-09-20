package lesson7.labs.prob2;

public class Ellipse implements ClosedCurve {
	
	double semiMajorAxis, ellipticIntegral;
	
	public Ellipse(double semiMajorAxis, double ellipticIntegral){
		this.semiMajorAxis = semiMajorAxis;
		this.ellipticIntegral = ellipticIntegral;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4 * semiMajorAxis * ellipticIntegral;
	}
	
}
