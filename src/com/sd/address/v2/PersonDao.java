package com.sd.address.v2;
import java.util.List;

public interface PersonDao{
  public void insert(PersonVO p);
  public List<PersonVO> findAll();
  public PersonVO findByName(String name);
  public void update(PersonVO p);
  public void delete(int id);
}