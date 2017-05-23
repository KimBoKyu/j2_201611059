package headfirst.iterator.dinermerger.before;
import java.util.ArrayList;

public class MenuTestDrive{
  public static void main(String[] args){
    PancakeHouseMenu p = new PancakeHouseMenu();
    DinerMenu d = new DinerMenu();
    System.out.println("Breakfast Menu");
    for(MenuItem m:p.getMenuItems()){
      //System.out.println(m.getName());
      System.out.println(m.toString());
    }
    System.out.println("\nDinner Menu");
    for(MenuItem m:d.getMenuItems()){
      //System.out.println(m.getName());
      System.out.println(m.toString());
    }
  }
}