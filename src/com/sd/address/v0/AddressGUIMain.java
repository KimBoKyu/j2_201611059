package com.sd.address.v0;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class AddressGUIMain implements ActionListener, Display{
  AddressBody address = new AddressBody();
  AddressData people1 = new AddressData();
  AddressData people2 = new AddressData();
  AddressData people3 = new AddressData();
  AddressData people4 = new AddressData();
  AddressData people5 = new AddressData();
  AddressData people6 = new AddressData();
  AddressData people7 = new AddressData();
  AddressData people8 = new AddressData();
  AddressData people9 = new AddressData();
  AddressData people10 = new AddressData();
  public AddressData[] peoples = {people1, people2, people3, people4, people5, people6, people7, people8, people9, people10};
  String my_name;
  String my_number;
  String my_birth;
  String my_memo;
  int i = 0;
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
    JButton b3 = new JButton("최근 등록 정보");
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
  
  public void display(){
    if(address.observers.size() > 0){
        //System.out.println("이름 : "+my_name+" 번호 : "+my_number+" 생일 : "+my_birth+" 메모 : "+my_memo);
      for(int j=0; j < i; j++){
        System.out.println((j+1)+ " " + "이름 : " + peoples[j].name + " 번호 : " + peoples[j].number + 
                         " 생일 : " + peoples[j].birth + " 메모 : " + peoples[j].memo);
      }
    }
    else{
      System.out.println("등록된 정보가 없습니다");
    }
  }
  
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
      if (cmd.equals("등록")) {
          my_name = getName(my_name);
          if(my_name.equals("")){
            System.out.println("이름은 필수적으로 적어야 합니다");
          }
          else{
            address.registerObserver(peoples[i]);
            my_number = getNumber(my_number);
            my_birth = getBirth(my_birth);
            my_memo = getMemo(my_memo);
            address.setdatas(my_name,my_number,my_birth,my_memo);
            name.setText("");
            number.setText("");
            birth.setText("");
            memo.setText("");
            System.out.println("등록 했습니다.");
            i++;
          }
      } else if (cmd.equals("삭제")) {
        if(i>0){
          address.removeObserver(peoples[i-1]);
          i--;
        }
      } else if(cmd.equals("최근 등록 정보")){
          address.display();
      } 
      else {
          display();
      }
  }
  public static void main(String[] args){
    AddressGUIMain a = new AddressGUIMain();
    a.createGUI();
  }
}

