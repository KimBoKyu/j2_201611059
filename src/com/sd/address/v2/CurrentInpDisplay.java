package com.sd.address.v2;
import java.util.*;

public class CurrentInpDisplay extends Display{
  public static void display(){
   System.out.println("이름 : "+AddressMain.my_name + "  주소 : " + AddressMain.my_address + 
                      "  번호 : " + AddressMain.my_number + "  메모 : " +  AddressMain.my_memo + " 를 입력하였습니다");
  }
}