package headfirst.singleton.chocolate;

public class ChocolateController{
  public static void main(String[] args){
    // ChocolateBoiler b = new ChocolateBoiler();
    // 위와 같은 방식은 안됩니다
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();
    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
  }
}