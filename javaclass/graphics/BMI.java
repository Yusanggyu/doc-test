import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JSlider.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class combobox extends JFrame {
    public combobox() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container c;
            c = getContentPane();
            c.setLayout(new FlowLayout());
            JLabel la1 = new JLabel("이름 :         ");
            JTextField name = new JTextField(15);
            JLabel lol = new JLabel("               ");
            JLabel la3 = new JLabel("키 :            ");
            JTextField height = new JTextField(15);
            JLabel la4 = new JLabel("               ");
            JLabel la5 = new JLabel("체중 :         ");
            JTextField weight = new JTextField(15);
            JLabel la6 = new JLabel("               ");
            JButton btn1 = new JButton("입력");
            JLabel la7 = new JLabel("               ");
            // JCheckBox male = new JCheckBox("남성");
            // JCheckBox female = new JCheckBox("여성");
            c.add(la1);
            c.add(name);
            c.add(lol);
            c.add(la3);
            c.add(height);
            c.add(la4);
            c.add(la5);
            c.add(weight);
            c.add(la6);
            c.add(btn1);
            c.add(la7);
            // c.add(male);
            // c.add(female);
            JLabel la2 = new JLabel("");
            c.add(la2);
            btn1.addActionListener(event-> {
                String names = name.getText();
                double heights = Integer.parseInt(height.getText());
                double weights = Integer.parseInt(weight.getText());
                double BMI_result = Math.round(weights/((heights/100)*(heights/100))*100)/100.0;
                if(BMI_result>=30) la2.setText(names+"님의 BMI는 "+BMI_result+"(고도비만)입니다.");
                else if(BMI_result>=25 && BMI_result<=29.9) la2.setText(names+"님의 BMI는 "+BMI_result+"(중도비만)입니다.");
                else if(BMI_result>=23 && BMI_result<=24.9) la2.setText(names+"님의 BMI는 "+BMI_result+"(과체중)입니다.");
                else if(BMI_result>=18.5 && BMI_result<=22.9) la2.setText(names+"님의 BMI는 "+BMI_result+"(정상)입니다.");
                else la2.setText(names+"님의 BMI는 "+BMI_result+"(저체중)입니다.");
                
            });
            setSize(300,200);
            setVisible(true);
        }

    public static void main(String[] args) {
        combobox mf = new combobox();
    }
}