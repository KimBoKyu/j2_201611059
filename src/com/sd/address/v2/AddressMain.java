package com.sd.address.v2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.util.Iterator;

public class AddressMain implements ActionListener{
  PersonDAOImpl personDAOImpl = new PersonDAOImpl();
  PersonVO person = new PersonVO();
  static String my_name;
  static String my_address;
  static String my_number;
  static String my_memo;
  static String inp;
  Scanner scan = new Scanner(System.in);
  JTextField name = new JTextField(5);
  JTextField address = new JTextField(5);
  JTextField number = new JTextField(5);
  JTextField memo = new JTextField(5);
  int idx = 1;
  public void createGUI(){
    JFrame f = new JFrame();
    Dimension frameSize = f.getSize();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    f.setLocation((screenSize.width - frameSize.width)/4,(screenSize.height - frameSize.height)/4);
    JPanel panel = new JPanel(new GridLayout(4,2));
    JPanel panel2 = new JPanel(new GridLayout(1,5));
    f.getContentPane().add(panel, "North");
    f.getContentPane().add(panel2, "South");
    JLabel label1 = new JLabel("이름",JLabel.CENTER);
    JLabel label2 = new JLabel("주소",JLabel.CENTER);
    JLabel label3 = new JLabel("번호",JLabel.CENTER);
    JLabel label4 = new JLabel("메모",JLabel.CENTER);
    JButton b1 = new JButton("등록");
    JButton b2 = new JButton("삭제(맨앞)");
    JButton b3 = new JButton("수정");
    JButton b4 = new JButton("사람 찾기");
    JButton b5 = new JButton("전체 출력");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    panel.add(label1);
    panel.add(name);
    panel.add(label2);
    panel.add(address);
    panel.add(label3);
    panel.add(number);
    panel.add(label4);
    panel.add(memo);
    panel2.add(b1);
    panel2.add(b2);
    panel2.add(b3);
    panel2.add(b4);
    panel2.add(b5);
    f.pack();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public String getName(){
    my_name = name.getText();
    return my_name;
  }
  
  public String getAddress(){
    my_address = address.getText();
    return my_address;
  }
  
  public String getNumber(){
    my_number = number.getText();
    return my_number;
  }
  
  public String getMemo(){
    my_memo = memo.getText();
    return my_memo;
  }
  
  public void dataSetnull(){
    name.setText("");
    address.setText("");
    number.setText("");
    memo.setText("");
  }
  public void actionPerformed(ActionEvent e){
    JButton b = (JButton)e.getSource();
    String cmd = e.getActionCommand();
    if(cmd.equals("등록")){
      my_name = getName();
      if(my_name.equals("")){
        NecessaryDisplay.display();
      }else{
        idx = personDAOImpl.getId() + 1;
        person.setName(my_name);
        person.setId(idx);
        my_address = getAddress();
        person.setAddress(my_address);
        my_number = getNumber();
        person.setNumber(my_number);
        my_memo = getMemo();
        person.setMemo(my_memo);
        personDAOImpl.insert(person);
        dataSetnull();
        CurrentInpDisplay.display();
      }
    }
    else if(cmd.equals("삭제(맨앞)")){
      int temp = personDAOImpl.getId() + 1;
      if(temp == 1){
        NonDataDisplay.display();
      } else{
        personDAOImpl.delete(1);
        if(idx==1){}
        else{idx--;}
      }
    }
    else if(cmd.equals("수정")){
      int temp = personDAOImpl.getId() + 1;
      if(temp == 1){
        NonDataDisplay.display();
      }
      else {
        my_name = getName();
        if(my_name.equals("")){
          NecessaryDisplay.display();
        } else{
          person.setName(my_name);
          my_address = getAddress();
          person.setAddress(my_address);
          my_number = getNumber();
          person.setNumber(my_number);
          my_memo = getMemo();
          person.setMemo(my_memo);
          System.out.print("수정할 인덱스 입력 : ");
          String inp = scan.nextLine();
          int m_i = Integer.parseInt(inp);
          if(m_i < temp){
            person.setId(m_i);
            personDAOImpl.update(person);
            dataSetnull();
            System.out.println("수정했습니다");
            AllDataDisplay.display();
          }
          else{
            dataSetnull();
            System.out.println("인덱스 오류");
          }
        }
      }
    }
    else if(cmd.equals("사람 찾기")){
      int temp = personDAOImpl.getId() + 1;
      if(temp == 1){
        NonDataDisplay.display();
      }else{        
        System.out.print("찾을 사람 이름 입력 : ");
        inp = scan.nextLine();
        FindPersonDisplay.display();
      }
    }
    else{
      int temp = personDAOImpl.getId() + 1;
      if(temp == 1){
        NonDataDisplay.display();
      }
      else{
        AllDataDisplay.display();
      }
    }
  }
  public static void main(String args[]){
    AddressMain a = new AddressMain();
    a.createGUI();
  }
}