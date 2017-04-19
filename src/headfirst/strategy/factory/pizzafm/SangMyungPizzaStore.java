package headfirst.factory.pizzafm;

public class SangMyungPizzaStore extends PizzaStore{
  public Pizza createPizza(String type){
    Pizza pizza = null;
    if(type.toLowerCase().equals("potato")){
      pizza = new SMStylePotatoPizza();
    }
    return pizza;
  }
}