package headfirst.factory.pizzafm;

public class NYStyleVeggiPizza extends Pizza{
  public NYStyleVeggiPizza(){
    name = "NY Style Sauce and Veggi Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    toppings.add("Grated Reggiano Cheese");
    toppings.add("Garlic");
    toppings.add("Onion");
    toppings.add("Mushrooms");
    toppings.add("Red Pepper");
  }
}