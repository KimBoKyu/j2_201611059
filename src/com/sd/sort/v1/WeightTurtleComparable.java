package com.sd.sort.v1;
import java.util.*;
import java.util.Collections.*;

public class WeightTurtleComparable{
  private int kilo;
  public WeightTurtleComparable(int k){
    this.kilo = k;
  }
  public static void main(String[] args){
    List<WeightTurtleComparable> l = new ArrayList<WeightTurtleComparable>();
    WeightTurtleComparable wt10 = new WeightTurtleComparable(10);
    WeightTurtleComparable wt15 = new WeightTurtleComparable(15);
    l.add(wt10);
    l.add(wt15);
    for(int i=0; i<l.size(); i++){
      System.out.println(l.get(i).toString());
    }
  }
}
