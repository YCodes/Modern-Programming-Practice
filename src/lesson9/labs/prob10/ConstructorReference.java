package lesson9.labs.prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface TriFunction<T, U, V, R>{
	 R apply(T t, U u, V v);
}

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male"), new Human("Mandi",55,"Female"), new Human("Christi",20,"Female")};
	
    // Query 1  : Print only male canditates
	List<Human> maleCandidate= Arrays.stream(list).filter(obj->obj.getGender()=="Male").collect(Collectors.toList());
	
	System.out.println(maleCandidate);
	
    // Query 2  : add some more objects to the list, and print the count of female candidates whose age is greater than 30 
	List<Human> femaleCandidate= Arrays.stream(list)
			.filter(obj->obj.getGender()=="Female" && obj.getAge()>30)
			.collect(Collectors.toList());
			
			System.out.println(femaleCandidate);
	
    // Query 3 : Practice for method reference Classname::new - Create an object by choosing suitable Interface to the specified constructors(Totally 3 constuctors) and print the object status
			Function<String, Human> ob = Human::new;
			Human obj = ob.apply("Mike");
			System.out.println(obj);
			
			BiFunction<String, Integer, Human> ob1 = Human::new;
			Human obj1 = ob1.apply("Chris", 25);
			System.out.println(obj1);
			
			TriFunction<String, Integer, String, Human> ob2 = Human::new;
			Human obj2 = ob2.apply("Rick", 38, "Male");
			System.out.println(obj2);

			
 // Query 4 : convert your Human array into ArrayList of Human by creating a static method, decide your arguments and return type   
    List<Human> col1 = arrayToCollection(list);
    System.out.println(col1);
   }


// Implement the body for Query 4
	public static List<Human> arrayToCollection(Human[] humanArray){
		return Arrays.asList(humanArray);	
	}

}

