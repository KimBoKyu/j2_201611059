package headfirst.singleton.threadsafe;

public class Singleton{
  private static Singleton uniqueInstance;
  private static int numCalled = 0;
  private Singleton(){}  
  public static synchronized Singleton getInstance(){
    if(uniqueInstance == null){
      System.out.println("Creating unique instance of Singleton");
      uniqueInstance = new Singleton();
    }
    System.out.println("Returning instance of Singleton");
    System.out.println("Number Called "+numCalled);
    numCalled++;
    return uniqueInstance;
  }
}