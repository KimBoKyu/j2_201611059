package com.sd.address.v0;

public class EmptyRoomDisplay implements Display{
  public void display(){
    System.out.println("남은 저장 공간 : "+ (10-AddressGUIMain.i));
  }
}