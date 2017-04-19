package headfirst.factory.pizzafm;

public class PizzaMain{
  public static void main(String[] args){
    PizzaStore ns = new NYPizzaStore();
    ns.orderPizza("CHEESE");
    ns.orderPizza("VEGGI");
    ns.orderPizza("CLAM");
    ns.orderPizza("PEPPERONI");
    PizzaStore cs = new ChicagoPizzaStore();
    cs.orderPizza("CHEESE");
    cs.orderPizza("VEGGI");
    cs.orderPizza("CLAM");
    cs.orderPizza("PEPPERONI");
    PizzaStore sms = new SangMyungPizzaStore();
    sms.orderPizza("Potato");
  }
}