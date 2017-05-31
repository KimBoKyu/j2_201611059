package com.sd.dao.v0;
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DaoMainV0 {
    public static void main (String[] args){
        Connection conn=null;
        ResultSet rs=null;
        Statement stmt=null;
        try {
            String path = System.getProperty("user.dir");
            path += "/src/mysql.properties";
            Properties prop = new Properties();
            prop.load(new FileInputStream(path));
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                prop.getProperty("URL")+"?useSSL=true",
                prop.getProperty("USER"),
                prop.getProperty("PASSWORD")
            );
            String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
            mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
            conn.createStatement().execute(mySql);
            conn.createStatement().execute("INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')");
            conn.createStatement().execute("INSERT INTO persons(name,address) VALUES('v0-2','2 Hongji Dong')");
            conn.createStatement().execute("INSERT INTO persons(name,address) VALUES('v0-3','3 Hongji Dong')");
            conn.createStatement().execute("DELETE FROM persons WHERE id=3 LIMIT 1");
            rs=conn.createStatement().executeQuery("SELECT name FROM persons WHERE id < 4 ORDER BY id");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
            } catch (Exception e) {};
            try {
                if(stmt != null) stmt.close();
            } catch (Exception e) {};
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {};
        }
    }
}