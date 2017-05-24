package headfirst.iterator.dinermerger.after;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
  ArrayList<MenuItem> items;
  public PancakeHouseMenu(){
    items = new ArrayList<MenuItem>();
    addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
    addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
  }
  public void addItem(String n, String d, boolean v, double p){
    MenuItem m = new MenuItem(n,d,v,p);
    items.add(m);
  }
  public ArrayList<MenuItem> getMenuItems(){
    return items;
  }
  public Iterator createIterator(){
    return new PancakeHouseMenuIterator(items);
  }
}