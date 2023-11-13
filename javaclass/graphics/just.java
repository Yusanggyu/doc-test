import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame {
    public MyFrame() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("유상규");
        JButton b2 = new JButton("비활성 버튼");
        JButton b3 = new JButton("좌표 출력");

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setFont(new Font("맑은고딕체", Font.ITALIC,20));

        b2.setEnabled(false);

        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JButton b = (JButton)e.getSource();
                MyFrame frame = (MyFrame)b.getTopLevelAncestor();
                frame.setTitle(b.getX()+","+b.getY());

            }
        });
        c.add(b1); c.add(b2); c.add(b3);

        setSize(260,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }
}