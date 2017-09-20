package lesson8.labs.prob1;

import java.util.function.Predicate;

public class MyClass {
	private int x, y;
	
	MyClass(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public boolean myMethod(MyClass cl){
		Predicate<MyClass> ab = this::equals;
		return ab.test(cl);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		MyClass ob = (MyClass) obj;
		if (this.x != ob.x) return false;
		if (this.y != ob.y) return false;
		return true;
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass(3,5);
		MyClass mc1 = new MyClass(3,5);
		System.out.println(mc.myMethod(mc1));
	}

}
