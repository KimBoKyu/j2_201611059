package com.sd.address.v0;

public class LastDataDisplay implements Display{
  public void display(){
    System.out.println("이름 : " + AddressGUIMain.peoples[AddressGUIMain.i-1].name +
                       " 번호 : " + AddressGUIMain.peoples[AddressGUIMain.i-1].number + 
                       " 생일 : " + AddressGUIMain.peoples[AddressGUIMain.i-1].birth +
                       " 메모 : " + AddressGUIMain.peoples[AddressGUIMain.i-1].memo);
  }
}