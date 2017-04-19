package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore{
  public Pizza createPizza(String type){
    Pizza pizza = null;
    if(type.toLowerCase().equals("cheese")){
      pizza = new NYStyleCheesePizza();
    }
    else if(type.toLowerCase().equals("pepperoni")){
      pizza = new NYStylePepperoniPizza();
    }
    else if(type.toLowerCase().equals("clam")){
      pizza = new NYStyleclamPizza();
    }
    else if(type.toLowerCase().equals("veggi")){
      pizza = new NYStyleVeggiPizza();
    }
    return pizza;
  }
}