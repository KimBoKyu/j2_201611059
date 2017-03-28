package com.sd.sort.v1;
import java.util.*;

public class In_sortA{
  public static void main(String[] args){
    List<Integer> num = new ArrayList<Integer>();
    for(int i=0; i<10; i++){
      num.add((int)(Math.random()*10)+1);
    }
    Collections.sort(num);
    for(int i=0; i<num.size(); i++){
      System.out.println(num.get(i));
    }
  }
}