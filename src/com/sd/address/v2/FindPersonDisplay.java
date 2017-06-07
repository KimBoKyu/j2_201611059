package com.sd.address.v2;
import java.util.*;

public class FindPersonDisplay extends Display{
  public static void display(){
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person;
    person = personDAOImpl.findByName(AddressMain.inp);
    System.out.println(person);
  }
}