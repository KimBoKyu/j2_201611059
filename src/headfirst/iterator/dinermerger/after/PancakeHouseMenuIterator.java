package headfirst.iterator.dinermerger.after;
import java.util.ArrayList;
public class PancakeHouseMenuIterator implements Iterator{
  private int position = 0;
  private ArrayList<MenuItem> items;
  public PancakeHouseMenuIterator(ArrayList<MenuItem> items){
    this.items = items;
  }
  public boolean hasNext(){
    if(position >= items.size()){
      return false;
    }
    else{
      return true;
    }
  }
  public Object next(){
    MenuItem m = items.get(position);
    position++;
    return m;
  }
}