package com.sd.address.v0;

public class AddressData implements Observer{
  public String name;
  private String number;
  private String birth;
  private String memo;
  
  public Observable addressbody;
  public AddressData(Observable addressbody){
    this.addressbody = addressbody;
    addressbody.registerObserver(this);
  }
  
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