package headfirst.singleton.chocolate;

public class ChocolateBoiler{
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled = 0;
  
  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }
  
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      System.out.println("Creating unique instance of Chocolate Boiler");
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("Returning instance of Chocolate Boiler");
    System.out.println("Number Called "+numCalled);
    numCalled++;
    return uniqueInstance;
  }
  
  public void fill(){
    if(isEmpty()){
      empty = false;
      boiled = false;
      System.out.println("It is now empty and is being filled");
    }
  }
  
  public void drain(){
    if(!isEmpty() && isBoiled()){
      empty = true;
      System.out.println("It is now draining");
    }
  }
  
  public void boil(){
    if(!isEmpty() && !isBoiled()){
      boiled = true;
      System.out.println("It is now boiling");
    }
  }
  
  public boolean isEmpty(){
    return empty;
  }
  
  public boolean isBoiled(){
    return boiled; 
  }
}