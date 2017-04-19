package headfirst.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore{
  public Pizza createPizza(String type){
    Pizza pizza = null;
    if(type.toLowerCase().equals("cheese")){
      pizza = new ChicagoStyleCheesePizza();
    }
    else if(type.toLowerCase().equals("pepperoni")){
      pizza = new ChicagoStylePepperoniPizza();
    }
    else if(type.toLowerCase().equals("clam")){
      pizza = new ChicagoStyleclamPizza();
    }
    else if(type.toLowerCase().equals("veggi")){
      pizza = new ChicagoStyleVeggiPizza();
    }
    return pizza;
  }
}