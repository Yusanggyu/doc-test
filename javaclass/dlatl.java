package javaclass.frame;

import java.awt.*;
import java.util.HexFormat;

import javax.swing.*;

public class MyFrame2 extends JFrame {
    public MyFrame2() {
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
        MyFrame2 mf = new MyFrame2();
    }
}



package javaclass.frame;

import java.awt.*;
import java.util.HexFormat;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("ContentPanel과 JFrame"); // 창의 제목

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료하라

        Container c = getContentPane();
        c.setBackground(Color.black);
        c.setLayout(null); //flowLayout
        JButton b = new JButton(Integer.toString(0));
        b.setLocation(0, 0); // 버튼의 위치 설정
        b.setSize(425,250); //버튼의 사이즈를 정함
        b.setBackground(Color.BLUE);
        c.add(b);
        JButton d = new JButton(Integer.toString(0));
        d.setLocation(425, 0); // 버튼의 위치 설정
        d.setSize(425,250); //버튼의 사이즈를 정함
        d.setBackground(Color.GREEN);
        c.add(d);
        JButton e = new JButton(Integer.toString(0));
        e.setLocation(850, 0); // 버튼의 위치 설정
        e.setSize(425,250); //버튼의 사이즈를 정함
        e.setBackground(Color.WHITE);
        c.add(e);
        JButton f = new JButton(Integer.toString(0));
        f.setLocation(1275, 0); // 버튼의 위치 설정
        f.setSize(425,250); //버튼의 사이즈를 정함
        f.setBackground(Color.BLUE);
        c.add(f);
        JButton g = new JButton(Integer.toString(0));
        g.setLocation(0, 250); // 버튼의 위치 설정
        g.setSize(425,250); //버튼의 사이즈를 정함
        g.setBackground(Color.GREEN);
        c.add(g);
        JButton h = new JButton(Integer.toString(0));
        h.setLocation(425, 250); // 버튼의 위치 설정
        h.setSize(425,250); //버튼의 사이즈를 정함
        h.setBackground(Color.BLUE);
        c.add(h);
        JButton q = new JButton(Integer.toString(0));
        q.setLocation(850, 250); // 버튼의 위치 설정
        q.setSize(425,250); //버튼의 사이즈를 정함
        q.setBackground(Color.BLUE);
        c.add(q);
        JButton i = new JButton(Integer.toString(0));
        i.setLocation(1275, 250); // 버튼의 위치 설정
        i.setSize(425,250); //버튼의 사이즈를 정함
        i.setBackground(Color.BLUE);
        c.add(i);
        JButton j = new JButton(Integer.toString(0));
        j.setLocation(0, 500); // 버튼의 위치 설정
        j.setSize(425,250); //버튼의 사이즈를 정함
        j.setBackground(Color.GREEN);
        c.add(j);
        JButton k = new JButton(Integer.toString(0));
        k.setLocation(425, 500); // 버튼의 위치 설정
        k.setSize(425,250); //버튼의 사이즈를 정함
        k.setBackground(Color.RED);
        c.add(k);
        JButton l = new JButton(Integer.toString(0));
        l.setLocation(850, 500); // 버튼의 위치 설정
        l.setSize(425,250); //버튼의 사이즈를 정함
        l.setBackground(Color.WHITE);
        c.add(l);
        JButton m = new JButton(Integer.toString(0));
        m.setLocation(1275, 500); // 버튼의 위치 설정
        m.setSize(425,250); //버튼의 사이즈를 정함
        m.setBackground(Color.BLUE);
        c.add(m);
        JButton z = new JButton(Integer.toString(0));
        z.setLocation(0, 750); // 버튼의 위치 설정
        z.setSize(425,250); //버튼의 사이즈를 정함
        z.setBackground(Color.BLUE);
        c.add(z);
        JButton x = new JButton(Integer.toString(0));
        x.setLocation(425, 750); // 버튼의 위치 설정
        x.setSize(425,250); //버튼의 사이즈를 정함
        x.setBackground(Color.GREEN);
        c.add(x);
        JButton v = new JButton(Integer.toString(0));
        v.setLocation(850, 750); // 버튼의 위치 설정
        v.setSize(425,250); //버튼의 사이즈를 정함
        v.setBackground(Color.BLUE);
        c.add(v);
        JButton y = new JButton(Integer.toString(0));
        y.setLocation(1275, 750); // 버튼의 위치 설정
        y.setSize(425,250); //버튼의 사이즈를 정함
        y.setBackground(Color.BLUE);
        c.add(y);
        setSize(300,150);
        setVisible(true);
    }

public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }
}
