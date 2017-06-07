package com.sd.address.v2;
import java.util.*;

public class AllDataDisplay extends Display{
  public static void display(){
    PersonDAOImpl personDAOImpl = new PersonDAOImpl();
    PersonVO person;
    List persons=personDAOImpl.findAll();
    Iterator iter=persons.iterator();
    System.out.println("-------------------------------------------------");
    while(iter.hasNext()) {
      person=(PersonVO)iter.next();
      System.out.println(person.toString());
    }
    System.out.println("-------------------------------------------------");
  }
}