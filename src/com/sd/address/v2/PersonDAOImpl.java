package com.sd.address.v2;
import java.sql.*;
import java.util.*;
import java.io.*;
public class PersonDAOImpl implements PersonDao{
  Connection conn = ConnectionFactory.getConnection();
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  public void insert(PersonVO p){
    try{
      String mysql = "INSERT INTO persons(id,name,address,number,memo) VALUES(?,?,?,?,?)";
      pstmt = conn.prepareStatement(mysql);
      pstmt.setInt(1, p.getId());
      pstmt.setString(2, p.getName());
      pstmt.setString(3, p.getAddress());
      pstmt.setString(4, p.getNumber());
      pstmt.setString(5, p.getMemo());
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
        person.setNumber(rs.getString("number"));
        person.setMemo(rs.getString("memo"));
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
  public PersonVO findByName(String name){
    PersonVO p = null;
    try{
      pstmt = conn.prepareStatement("SELECT * FROM persons WHERE name = ?");
      pstmt.setString(1, name);
      rs = pstmt.executeQuery();
      if(rs.next() == true){
        p = new PersonVO();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        p.setNumber(rs.getString("number"));
        p.setMemo(rs.getString("memo"));
      }
    } catch (Exception e){
      e.printStackTrace();
    }
    return p;
  }
  public void update(PersonVO p){
    try{
      pstmt = conn.prepareStatement("UPDATE persons SET name=?, address=?, number=?, memo=? WHERE id = ?");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      pstmt.setString(3,p.getNumber());
      pstmt.setString(4,p.getMemo());
      pstmt.setInt(5,p.getId());
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
      conn.createStatement().execute("UPDATE persons SET id = id - 1;");
      if(rows == 0){
      } else if(rows > 0){
        AllDataDisplay.display();
      } 
    } catch(Exception e){
      e.printStackTrace();
    }
  }
  public void close(){
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
  public int getId(){
    int id = 0;
    try{
      pstmt = conn.prepareStatement("select * from persons");
      rs = pstmt.executeQuery();
      while(rs.next()){
        id = rs.getInt("id");
      }
    } catch(Exception e){
      e.printStackTrace();
    }
    return id;
  }
}