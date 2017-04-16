package com.sd.address.v0;

public class AddressData implements Observer{
  private String name;
  private String number;
  private String birth;
  private String memo;
  
  public Observable addressbody;
  public AddressData(Observable addressbody){
    this.addressbody = addressbody;
    addressbody.registerObserver(this);
  }

  public void update(String name, String number, String birth, String memo){
    this.name = name;
    this.number = number;
    this.birth = birth;
    this.memo = memo;
  }
}