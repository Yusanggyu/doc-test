import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class game extends JFrame {
    public game() {
        Container c = getContentPane();
        JLabel la5 = new JLabel("1학년 12345 최애과목 정보 수학입니다!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("오성 학생 정보 관리 프로그램");
        c.setLayout(new FlowLayout());
        JLabel la = new JLabel("ooo오성 학생 정보 관리 프로그램ooo");
        JLabel la2 = new JLabel("학년 : ");
        JLabel la3 = new JLabel("학번");
        JLabel la4 = new JLabel("이름");
        JRadioButton first = new JRadioButton("1학년");
        JRadioButton second = new JRadioButton("2학년");
        JRadioButton third = new JRadioButton("3학년");
        JTextField name = new JTextField("                   ");
        JTextField num = new JTextField("               ");
        JLabel la6 = new JLabel("좋아하는 과목");
        Choice cho = new Choice(); 
		cho.addItem("국어"); 
		cho.addItem("수학"); 
		cho.addItem("사회");
        JButton enter = new JButton("입력");
        JLabel la7 = new JLabel("방명록");
        JTextField tf = new JTextField("                               ");
        TextArea txtarea = new TextArea("Textarea");
        name.setBounds(50,40,1000,30);
        num.setBounds(80,40,1000,30);
        la.setBounds(20,0,1000,30);
        la2.setBounds(20,40,100,30);
        la3.setBounds(30,40,30,30);
        la4.setBounds(100,40,50,30);
        la6.setBounds(10,50,60,30);
        cho.setBounds(50,50,100,30);
        enter.setBounds(70,50,50,30);
        la5.setBounds(0,60,200,50);
        la7.setBounds(20,80,100,30);
        tf.setBounds(50,80,200,30);
        // la5.setBounds("");
        first.setBounds(60,20,70,30);
        second.setBounds(130,20,70,30);
        third.setBounds(200,20,70,30);
        txtarea.setBounds(20,80,200,50);
        c.add(la);
        c.add(la2); c.add(first); c.add(second); c.add(third); c.add(la3); c.add(name); c.add(la4); c.add(num);
        c.add(la6); c.add(cho); c.add(enter);
        c.add(la5); c.add(la7); c.add(tf); c.add(txtarea);
        setSize(250, 400);
        setVisible(true);

        // c.setFocusable(true);
        // c.requestFocus();
    }

    public static void main(String[] args) {
        game mf = new game();
    }
}