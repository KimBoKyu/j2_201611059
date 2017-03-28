package com.sd.sort.v0;
import java.util.*;
public class St_sort{
  public static void main(String[] args){
    String[] data = {"John", "Adam", "Skrien", "Smith", "Jones"};
    for(int i=data.length-1;i>0;i--){
      int indexOfMax = 0;
      for(int j=1; j<=i; j++){
        if(data[j].compareTo(data[indexOfMax])>0)
          indexOfMax=j;
      }
      String temp = data[i];
      data[i]=data[indexOfMax];
      data[indexOfMax] = temp;
    }
    for(int i=0; i<data.length; i++){
      System.out.println("data["+i+"]="+data[i]);
    }
  }
}