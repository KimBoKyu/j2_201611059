package headfirst.factory.pizzaaf.small;

public abstract class Pizza{
  String name;
  Dough dough;
  Cheese cheese;
  abstract void prepare();
  void bake(){
    System.out.println("Baking");
  }
  void cut(){
    System.out.println("Cutting");
  }
  void box(){
    System.out.println("Boxing");
  }
  void setName(String name){
    this.name = name;
  }
  String getName(){
    return name;
  }
  public String toString(){
    StringBuffer result = new StringBuffer();
    result.append("----" + name + "----\n");
    if(dough != null){
      result.append(dough);
      result.append("\n");
    }
    if(cheese != null){
      result.append(cheese);
      result.append("\n");
    }
    return result.toString();
  }
}