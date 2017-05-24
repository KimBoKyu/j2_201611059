package headfirst.iterator.dinermerger.after;

public class DinerMenu implements Menu{
  MenuItem[] items;
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  public DinerMenu(){
    items = new MenuItem[MAX_ITEMS];
    addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
    addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
    addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
    addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    addItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
    addItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
  }
  public void addItem(String n, String d, boolean v, double p){
    if(numberOfItems >= MAX_ITEMS){
      System.out.println("Can not add Item already full");
    } else{
      MenuItem m = new MenuItem(n,d,v,p);
      items[numberOfItems] = m;
      numberOfItems++;
    }
  }
  public MenuItem[] getMenuItems(){
    return items;
  }
  public Iterator createIterator(){
    return new DinerMenuIterator(items);
  }
}
