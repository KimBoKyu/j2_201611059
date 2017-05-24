package headfirst.iterator.dinermerger.after;

public class DinerMenuIterator implements Iterator{
  private int position = 0;
  private MenuItem[] items;
  public DinerMenuIterator(MenuItem[] items){
    this.items = items;
  }
  public boolean hasNext(){
    if(position >= items.length || items[position] == null){
      return false;
    }
    else{
      return true;
    }
  }
  public Object next(){
    MenuItem m = items[position];
    position++;
    return m;
  }
}