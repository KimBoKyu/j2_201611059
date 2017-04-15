package com.sd.address.v0;
import java.util.ArrayList;

public class AddressBody implements Observable {
  public ArrayList<Observer> observers = new ArrayList<Observer>();
  private String name;
  private String number;
  private String birth;
  private String memo;
 public void registerObserver(Observer o){
    observers.add(o);
  }
  public void removeObserver(Observer o){
    int l = observers.size();
    System.out.println(l);
    if(l>0){
     observers.remove(l-1); 
    }
  }
  public void dataChanged(){
   notifyObservers(); 
  }
  public void notifyObservers(){
    for(int i=0; i<observers.size(); i++){
      Observer observer = (Observer)observers.get(i);
      observer.update(name, number, birth, memo);      
    }
  }
  
  public String getName(){
    return name;
  }
  
  public void display(){
    for(int i=0; i<observers.size(); i++){
      Object obj = observers.get(i).toString();
      System.out.println(obj);
    }
  }
  
  public void setdatas(String name, String number, String birth, String memo) {
   this.name = name;
   this.number = number;
   this.birth = birth;
   this.memo = memo;
   dataChanged();
  }
}