package lanchonete;

public class MealBuilder {
	 public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      meal.addItem(new Cashew());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new TraditionalBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }

}
