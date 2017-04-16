package com.sd.address.v0;
import java.util.ArrayList;

public class AddressBody implements Observable, Display {
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
    System.out.println("최근 등록된 이름 : " + name +" 번호 : " +  number  + " 생일 : " +  birth  + " 메 : " +  memo + " 를 삭제했습니다.");
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
  
  public void display(){
    if(observers.size() == 0){
      System.out.println("등록된 정보가 없습니다");
    }
    else{
      for(int i=0; i<observers.size(); i++){
        System.out.println(observers);
      }
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