package lesson8.labs.prob2;

import java.util.function.Supplier;

public class SupplierInterface {
	
	public class MyInnerClass implements Supplier{
		
		@Override
		public Object get() {
			// TODO Auto-generated method stub
			return Math.random();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupplierInterface.MyInnerClass siInner = new SupplierInterface().new MyInnerClass();
		double result = (double) siInner.get();
		System.out.println(result);
		
	}

}
