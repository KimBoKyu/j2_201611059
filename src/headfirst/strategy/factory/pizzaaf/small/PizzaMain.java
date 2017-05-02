package headfirst.factory.pizzaaf.small;

public class PizzaMain{
  public static void main(String[] args){
    PizzaStore ns = new NYPizzaStore();
    PizzaStore cs = new ChicagoPizzaStore();
    ns.orderPizza("cheese");
    cs.orderPizza("cheese");
  }
}