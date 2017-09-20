package lesson8.labs.prob4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}
	
	
	public static void main(String[] args){
		
		Product p1 = new Product("Mobiles", 200.00, 2200);
		Product p2 = new Product("Headphones", 20.22, 122);
		Product p3 = new Product("Laptop", 5000.50, 555);
		Product p4 = new Product("Apple Macbook",1000.0,1233);
		Product p5 = new Product("Laptop", 550.50, 500);
		
		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);
		
		
		System.out.println("Sorting by product price: ");
	
		Collections.sort(products, new Comparator<Product>(){
			@Override
			public int compare(Product prod1, Product prod2) {
				
				if(prod1.getPrice()==prod2.getPrice()) return 0;
				if(prod1.getPrice()<prod2.getPrice()) return -1;
				else return 1;
			}
		});
		System.out.println(products);
		
		System.out.println("\nSorting by product Title: ");
		Collections.sort(products, new Comparator<Product>(){
			@Override
			public int compare(Product prod1, Product prod2) {
				
				return prod1.getTitle().compareTo(prod2.getTitle());
			}
		});
		System.out.println(products);
		
		System.out.println("\nDecreasing order sorting by product price using lambda: ");
		Collections.sort(products, (ob1, ob2)-> ob2.getPrice() < ob1.getPrice() ? -1:1 );
		
		//Collections.sort(products, Comparator.comparing(Product::getPrice).reversed());
		System.out.println(products);
		
		System.out.println("\nDecreasing order sorting by product title using lambda: ");
		Collections.sort(products, (ob1, ob2)-> ob2.getTitle().compareTo(ob1.getTitle()));
		
		//Collections.sort(products, Comparator.comparing(Product::getTitle).reversed());
		System.out.println(products);
		
		System.out.println("\nSorting by product model if title is same using lambda: ");
		Collections.sort(products, (ob1, ob2) -> { 
			if(ob1.getTitle().equals(ob2.getTitle())){
				 return ob2.getModel() < ob1.getModel()  ? -1:1; // Sets in descending order of model
			}
			return ob1.getTitle().compareTo(ob2.getTitle());
		});
		
		//Collections.sort(products, Comparator.comparing(Product::getTitle).thenComparing(Product::getModel));
		System.out.println(products);
		
	} // End of main
}
