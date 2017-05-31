package com.sd.dao.v1;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImp1 implements PersonDao{
  List<PersonVO> persons;
  public PersonDaoImp1(){
    persons = new ArrayList<PersonVO>();
  }
  public void insert(PersonVO p){
    persons.add(p);
  }
  public List<PersonVO> findAll(){
    return persons;
  }
  public PersonVO findById(int id){
    if(id>persons.size()){
      System.out.println("Out of Index");
      return null;
    }
    else{
      return persons.get(id);
    }
  }
  public void update(PersonVO p){
    persons.get(p.getId()).setName(p.getName());
    System.out.println("updating "+p.getId());
  }
  public void delete(int id){
    if(id>persons.size()){
      System.out.println("Out of Index");
    }
    else{
      persons.remove(id);
    }
  }
  public void delete(PersonVO p){
    persons.remove(p.getId());
    System.out.println("deleting "+p.getId());
  }
}