package headfirst.factory.pizzafm;

public class NYStyleclamPizza extends Pizza{
  public NYStyleclamPizza(){
    name = "NY Style Sauce and clam Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    toppings.add("Grated Reggiano Cheese");
    toppings.add("Fresh Clams from Long Island Sound");
  }
}