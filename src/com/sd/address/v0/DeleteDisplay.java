package com.sd.address.v0;

public class DeleteDisplay implements Display{
  public void display(){
    System.out.println("이름 : " + AddressGUIMain.peoples[AddressGUIMain.i].name + 
                       " 번호 : " + AddressGUIMain.peoples[AddressGUIMain.i].number + 
                       " 생일 : " + AddressGUIMain.peoples[AddressGUIMain.i].birth + 
                       " 메모 : " + AddressGUIMain.peoples[AddressGUIMain.i].memo + 
                       " 를 삭제했습니다");
  }
}
