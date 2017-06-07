package com.sd.dao.v2;
import java.sql.*;
import java.util.*;
import java.io.*;
public class PersonDAOImpl implements PersonDao{
  Connection conn = ConnectionFactory.getConnection();
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  public void insert(PersonVO p){
    try{
      String mysql = "INSERT INTO persons(id,name,address) VALUES(NULL,?,?)";
      pstmt = conn.prepareStatement(mysql);
      pstmt.setString(1, p.getName());
      pstmt.setString(2, p.getAddress());
      pstmt.executeUpdate();
    } catch (Exception e){
      e.printStackTrace();
    }
  }
  public List<PersonVO> findAll(){
    Statement stmt = null;
    List<PersonVO> persons = new ArrayList<PersonVO>();
    try{
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT * FROM persons");
      PersonVO person = null;
      while(rs.next()){
        person = new PersonVO();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setAddress(rs.getString("address"));
        persons.add(person);
      }
    } catch (Exception e){
      e.printStackTrace();
    } finally{
      try{
        if(stmt != null) stmt.close();
      } catch(Exception e){
        e.printStackTrace();
      }
    }
    return persons;
  }
  public PersonVO findById(int id){
    PersonVO p = null;
    try{
      pstmt = conn.prepareStatement("SELECT * FROM persons WHERE id = ?");
      pstmt.setInt(1, id);
      System.out.println("Finding by id..."+id);
      rs = pstmt.executeQuery();
      if(rs.next() == true){
        p = new PersonVO();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
      }
    } catch (Exception e){
      e.printStackTrace();
    }
    return p;
  }
  public void update(PersonVO p){
    try{
      pstmt = conn.prepareStatement("UPDATE persons SET name=?, address=? WHERE id = ?");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      pstmt.setInt(3,p.getId());
      System.out.println("Updating ...");
      pstmt.executeUpdate();
    } catch (Exception e){
      e.printStackTrace();
    }
  }
  public void delete(int id){
    try{
      pstmt = conn.prepareStatement("DELETE FROM persons WHERE id=?");
      pstmt.setInt(1,id);
      int rows = pstmt.executeUpdate();
      if(rows == 0){
        System.out.println("Can not delete " + id +  " does not exist");
      } else if(rows > 0){
        System.out.println("Deleting ...");
      } 
    } catch(Exception e){
      e.printStackTrace();
    }
  }
  public void delete(PersonVO p){
    int id = p.getId();
    try{
      pstmt = conn.prepareStatement("DELETE FROM persons WHERE id=?");
      pstmt.setInt(1,id);
      int rows = pstmt.executeUpdate();
      if(rows == 0){
        System.out.println("Can not delete " + id + " does not exist");
      } else if(rows > 0){
        System.out.println("Deleting ...");
      }
    } catch(Exception e){
      e.printStackTrace();
    }
  }
  public void close(){
    System.out.println("Closing....");
    try {
      if(rs != null) rs.close();
    } catch (Exception e) {};
    try {
      if(pstmt != null) pstmt.close();
    } catch (Exception e) {};
    try {
      if (conn != null) conn.close();
    } catch (Exception e) {};
  }
}