package com.sd.sort.v1;
import java.util.*;

public class In_sort{
  public static void main(String[] args){
    Integer[] num = new Integer[] {5,3,4,2,1};
    Arrays.sort(num);
    for(int i=0; i<num.length; i++){
      System.out.println(num[i]);
    }
  }
}