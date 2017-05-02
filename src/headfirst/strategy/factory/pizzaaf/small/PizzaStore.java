package headfirst.factory.pizzaaf.small;

public abstract class PizzaStore{
  public abstract Pizza createPizza(String type);
  public Pizza orderPizza(String type){
    Pizza p;
    p = createPizza(type);
    System.out.println("-- Making a "+p.getName());
    p.prepare();
    p.bake();
    p.cut();
    p.box();
    return p;
  }
}