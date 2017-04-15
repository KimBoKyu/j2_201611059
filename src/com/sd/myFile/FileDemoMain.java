package com.sd.myFile;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.Reader;


public class FileDemoMain{
  public static void main(String[] args) throws Exception{
    File readme = null;
    InputStream isReadme = null;
    int i;
    char c;
    BufferedReader brReadme = null;
    try{
      File myhome = new File(System.getProperty("user.home"));
      System.out.println("my home is " + myhome);
      
      String cwd = new File(".").getCanonicalPath();
      System.out.println("current working dir is "+ cwd);
      
      readme = new File(cwd,"hello.txt");
      System.out.println("readme file is "+readme);
      
      isReadme = new FileInputStream(readme);
      System.out.println("Characters printed : ");
      
      while((i = isReadme.read()) != -1 ){
        c = (char)i;
        System.out.print(c);
      }
    }catch(Exception e){
       e.printStackTrace();
    }finally{
      if(isReadme != null){
        isReadme.close();
      }
    }
    
    try{
      isReadme = new FileInputStream(readme);
      InputStreamReader isrReadme = new InputStreamReader(isReadme, "UTF8");
      brReadme = new BufferedReader(isrReadme);
      StringBuffer sbuffer = new StringBuffer();
      while((i=brReadme.read())!=-1){
        c = (char)i;
        sbuffer.append(c);
      }
      System.out.println("--"+sbuffer.toString());
    }catch(Exception e){
       e.printStackTrace();
    }finally{
      if(brReadme != null){
        brReadme.close();
      }
    }
  }
}