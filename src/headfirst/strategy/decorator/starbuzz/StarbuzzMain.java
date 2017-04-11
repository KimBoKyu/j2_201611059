package headfirst.decorator.starbuzz;

public class StarbuzzMain{
  public static void main(String[] args){
    Berverage beverage = new CaramelMakkiatto();
    beverage = new Milk(beverage);
    beverage = new Vanilla(beverage);
    beverage = new Caramel(beverage);
    System.out.println(beverage.getDescription() + " $" + beverage.getCost());
  }
}

