package com.sd.address.v0;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class AddressGUIMain implements ActionListener{
  AddressBody adb = new AddressBody();
  AddressDataDisplay did;
  String my_name;
  String my_number;
  String my_birth;
  String my_memo;
  JTextField name = new JTextField(5);
  JTextField number = new JTextField(5);
  JTextField birth = new JTextField(5);
  JTextField memo = new JTextField(5);
  public void createGUI(){
    JFrame f = new JFrame();
    Dimension frameSize = f.getSize();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    f.setLocation((screenSize.width - frameSize.width)/4,(screenSize.height - frameSize.height)/4);
    JPanel panel = new JPanel(new GridLayout(4,2));
    JPanel panel2 = new JPanel(new GridLayout(1,4));
    f.getContentPane().add(panel, "North");
    f.getContentPane().add(panel2, "South");
    JLabel label1 = new JLabel("이름",JLabel.CENTER);
    JLabel label2 = new JLabel("번호",JLabel.CENTER);
    JLabel label3 = new JLabel("생일",JLabel.CENTER);
    JLabel label4 = new JLabel("메모",JLabel.CENTER);
    JButton b1 = new JButton("등록");
    JButton b2 = new JButton("삭제");
    JButton b3 = new JButton("전체 출력(입력순)");
    JButton b4 = new JButton("전체 출력(이름순)");
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    panel.add(label1);
    panel.add(name);
    panel.add(label2);
    panel.add(number);
    panel.add(label3);
    panel.add(birth);
    panel.add(label4);
    panel.add(memo);
    panel2.add(b1);
    panel2.add(b2);
    panel2.add(b3);
    panel2.add(b4);
    f.pack();
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public String getName(String my_name){
    my_name = name.getText();
    return my_name;
  }
  public String getNumber(String my_number){
    my_number = number.getText();
    return my_number;
  }
  public String getBirth(String my_birth){
    my_birth = birth.getText();
    return my_birth;
  }
  public String getMemo(String my_memo){
    my_memo = memo.getText();
    return my_memo;
  }
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
      if (cmd.equals("등록")) {
          AddressDataDisplay did = new AddressDataDisplay(adb);
          my_name = getName(my_name);
          my_number = getNumber(my_number);
          my_birth = getBirth(my_birth);
          my_memo = getMemo(my_memo);
          adb.setdatas(my_name,my_number,my_birth,my_memo);
          name.setText("");
          number.setText("");
          birth.setText("");
          memo.setText("");
          System.out.println("등록 했습니다.");
      } else if (cmd.equals("삭제")) {
          adb.removeObserver(did);
      } else {
          adb.display();
      }
  }
  public static void main(String[] args){
    AddressGUIMain a = new AddressGUIMain();
    a.createGUI();
  }
}

