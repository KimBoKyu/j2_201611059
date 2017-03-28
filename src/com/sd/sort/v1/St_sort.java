package com.sd.sort.v1;
import java.util.*;

public class St_sort{
  public static void main(String[] args){
    String[] s = {"John", "Adam", "Skrien", "Smith", "Jones"};
    Arrays.sort(s);
    for(int i=0; i<s.length; i++){
      System.out.println(s[i]);
    }
  }
}