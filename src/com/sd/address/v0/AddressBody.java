package com.sd.address.v0;
import java.util.ArrayList;

public class AddressBody implements Observable{
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
    if(l>0){
     observers.remove(l-1); 
    }
    else{
     System.out.println("등록된 정보가 없습니다.");
    }
  }
  public void dataChanged(){
   notifyObservers();
  }
  public void notifyObservers(){
    int i = observers.size() - 1;
    Observer observer = (Observer)observers.get(i);
    observer.update(name, number, birth, memo);      
  }
  
  public void setdatas(String name, String number, String birth, String memo) {
   this.name = name;
   this.number = number;
   this.birth = birth;
   this.memo = memo;
   dataChanged();
  }
}