package com.sd.address.v0;

public class AddressData implements Observer{
  public String name;
  public String number;
  public String birth;
  public String memo;
  
  public String getName(String name){
    return name;
  }
  
  public String getNumber(String number){
    return number;
  }
  
  public String getBirth(String birth){
    return birth;
  }
  public String getMemo(String memo){
    return memo;
  }
  
  public void update(String name, String number, String birth, String memo){
    this.name = name;
    this.number = number;
    this.birth = birth;
    this.memo = memo;
  }
}