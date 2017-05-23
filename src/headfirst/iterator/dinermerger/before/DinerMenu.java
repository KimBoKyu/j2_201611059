package headfirst.iterator.dinermerger.before;

public class DinerMenu{
  MenuItem[] menuItems;
  static final int MAX_ITEMS = 3;
  int numberOfItems = 0;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29);
  }
  public void addItem(String n, String d, boolean v, double p){
    if(numberOfItems >= MAX_ITEMS){
      System.out.println("Can not add Item already full");
    } else{
      MenuItem m = new MenuItem(n,d,v,p);
      menuItems[numberOfItems] = m;
      numberOfItems++;
    }
  }
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
}