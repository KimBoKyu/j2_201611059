package com.sd.address.v0;

public class SearchDisplay implements Display{
  public void display(){
    System.out.println("이름 : " + AddressGUIMain.peoples[AddressGUIMain.l].name +
                       " 번호 : " + AddressGUIMain.peoples[AddressGUIMain.l].number + 
                       " 생일 : " + AddressGUIMain.peoples[AddressGUIMain.l].birth +
                       " 메모 : " + AddressGUIMain.peoples[AddressGUIMain.l].memo);
  }
}