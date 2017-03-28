package com.sd.sort.v1;
import java.util.*;

public class Weight implements Comparable{
    private int kilo;
    public Weight(int k){
      this.kilo = k;
    }
    public int getHeavier(Weight w){
      return this.kilo - w.kilo;
    }
    public int compareTo(Object o){
      Weight w = (Weight)o;
      return this.kilo - w.kilo;
    }
    public String toString(){
      String msg = kilo + "";
      return msg;
    }
}