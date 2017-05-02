package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory facp;
  public CheesePizza(PizzaIngredientFactory facp){
    name = "Cheese Pizza";
    this.facp = facp;
  }
  public void prepare(){
    dough = facp.createDough();
    cheese = facp.createCheese();
    System.out.println(dough.toString());
    System.out.println(cheese.toString());
  }
}