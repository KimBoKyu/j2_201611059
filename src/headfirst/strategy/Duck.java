package headfirst.strategy;

public abstract class Duck {
  FlyBehavior flyBehavior; // private로 하면 실행이 안된다. 나머지는 된다.
  QuackBehavior quackBehavior;
  public Duck() {
  }
  public void setFlyBehavior (FlyBehavior fb) {
    flyBehavior = fb;
  }
  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }
  abstract void display();
  public void performFly() {
    flyBehavior.fly();
  }
  public void performQuack() {
    quackBehavior.quack();
  }
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}