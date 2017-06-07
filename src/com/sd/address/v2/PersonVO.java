package com.sd.address.v2;

public class PersonVO{
  private int id;
  private String name;
  private String address;
  private String number;
  private String memo;
  public PersonVO(){}
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public String getAddress(){
    return address;
  }
  public void setAddress(String address){
    this.address = address;
  }
  public String getNumber(){
    return number;
  }
  public void setNumber(String number){
    this.number = number;
  }
  public String getMemo(){
    return memo;
  }
  public void setMemo(String memo){
    this.memo = memo;
  }
  public String toString(){
    return "인덱스 : " + id + "  이름 : " + name + "  주소 : " + address + "  번호 : " + number + "  메모 : " + memo; 
  }
}