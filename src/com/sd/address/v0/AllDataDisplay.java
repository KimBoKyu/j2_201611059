package com.sd.address.v0;

public class AllDataDisplay implements Display{
  public void display(){
    for(int j=0; j < AddressGUIMain.i; j++){
      System.out.println((j+1)+ " " + "이름 : " + AddressGUIMain.peoples[j].name +
                         " 번호 : " + AddressGUIMain.peoples[j].number + 
                         " 생일 : " + AddressGUIMain.peoples[j].birth +
                         " 메모 : " + AddressGUIMain.peoples[j].memo);
    }
  }
}