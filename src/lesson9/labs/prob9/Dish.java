package lesson9.labs.prob9;
import java.util.*;

import com.sun.javafx.scene.control.behavior.OptionalBoolean;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
   public static void main(String[] args) {
	   System.out.println(isVegeterianMeal(menu));
	   System.out.println(isHealthyMeal(menu));
	   System.out.println(isUnhealthyMeal(menu));
	   System.out.println(findFirstMeat(menu).get());
	   System.out.println(calculateTotalCalories(menu));
	   System.out.println(calculateTotalCaloriesAlt(menu));
   }
   
   public static boolean isVegeterianMeal(List<Dish> meals){
	   boolean result =  meals.stream().filter(m->m.getType()==Type.OTHER).findAny().isPresent();
	   return result;
   }
   
   public static boolean isHealthyMeal(List<Dish> meals){
	   boolean result =  meals.stream().filter(m->m.getCalories()<1000).findAny().isPresent();
	   return result;
   }
   
   public static boolean isUnhealthyMeal(List<Dish> meals){
	   boolean result =  meals.stream().filter(m->m.getCalories()>1000).findAny().isPresent();
	   return result;
   }
   
   public static Optional<Dish> findFirstMeat(List<Dish> meals){
	  return  meals.stream().filter(m->m.getType().equals(Type.MEAT)).findFirst();
   }
   
   public static int calculateTotalCalories(List<Dish> meals){
	   return meals.stream().map(m->m.getCalories()).reduce(0, (a,b)-> a+b);
   }
   
   public static int calculateTotalCaloriesAlt(List<Dish> meals){
	   return meals.stream().map(Dish::getCalories).reduce(0, (a,b)-> a+b);
   }
}