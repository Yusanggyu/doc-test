package graphics;

import java.awt.*;
import java.util.HexFormat;

import javax.swing.*;

public class randomdot extends JFrame {
    public randomdot() {
        setTitle("ContentPanel과 JFrame"); // 창의 제목

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료하라

        Container c = getContentPane();
        c.setBackground(Color.white);
        c.setLayout(null); //flowLayout
        int i = 0;
        while(i < 20) {
            int x = (int)(Math.random()*1700) + 50;
            int y = (int)(Math.random()*1000) + 50;
            JLabel label = new JLabel();
            label.setForeground(Color.BLUE);
            label.setLocation(x,y);
            label.setSize(10,10);
            label.setOpaque(true);
            label.setBounds(x, y, 20, 20);
            label.setOpaque(true);
            label.setBackground(Color.red);
            c.add(label);
            i++;
        }
        setSize(300,150);
        setVisible(true);
    }
public static void main(String[] args) {
        randomdot mf = new randomdot();
    }
}