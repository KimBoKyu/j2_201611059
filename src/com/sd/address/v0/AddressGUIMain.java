package com.sd.address.v0;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
  
public class AddressGUIMain implements ActionListener{
  AddressBody address = new AddressBody();
  Display deld = new DeleteDisplay();
  Display nond = new NonUserDataDisplay();
  Display emd = new EmptyRoomDisplay();
  Display ad = new AllDataDisplay();
  Display ld = new LastDataDisplay();
  Display sd = new SearchDisplay();
  static AddressData people1 = new AddressData();
  static AddressData people2 = new AddressData();
  static AddressData people3 = new AddressData();
  static AddressData people4 = new AddressData();
  static AddressData people5 = new AddressData();
  static AddressData people6 = new AddressData();
  static AddressData people7 = new AddressData();
  static AddressData people8 = new AddressData();
  static AddressData people9 = new AddressData();
  static AddressData people10 = new AddressData();
  static AddressData[] peoples = {people1, people2, people3, people4, people5, people6, people7, people8, people9, people10};
  String my_name;
  String my_number;
  String my_birth;
  String my_memo;
  String message;
  Scanner scan = new Scanner(System.in);
  static int l = 0;
  static int i = 0;
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
    JButton b3 = new JButton("찾기");
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
  
  public void dataSetnull(){
    name.setText("");
    number.setText("");
    birth.setText("");
    memo.setText("");
  }
  
  public int search(int l){
    System.out.print("찾을 등록자의 이름 입력 : ");
    message = scan.nextLine();
    for(int j=0; j<i; j++){
      if(peoples[j].name.equals(message)){
        l = j;
      }
    }
    return l;
  }
  
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource();
    String cmd=e.getActionCommand();
      if (cmd.equals("등록")) {
        my_name = getName(my_name);
        if(my_name.equals("")){
          System.out.println("이름은 필수적으로 적어야 합니다");
        } else{
          address.registerObserver(peoples[i]);
          my_number = getNumber(my_number);
          my_birth = getBirth(my_birth);
          my_memo = getMemo(my_memo);
          address.setdatas(my_name,my_number,my_birth,my_memo);
          dataSetnull();
          i++;
          System.out.println("등록 했습니다.");
          emd.display();
        }
      } else if (cmd.equals("삭제")) {
        if(i>0){
          i--;
          address.removeObserver(peoples[i]);
          deld.display();
          emd.display();
        } else{
          nond.display();
        }
      } else if(cmd.equals("찾기")){
        if(address.observers.size() > 0){
          l = search(l);
          sd.display();
        } else{
           nond.display();
        }
      } else {
        if(address.observers.size() > 0){
          ad.display();
        } else{
          nond.display();
        }
      }
  }
  public static void main(String[] args){
    AddressGUIMain a = new AddressGUIMain();
    a.createGUI();
  }
}

