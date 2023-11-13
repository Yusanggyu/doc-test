import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame {
    public MyFrame() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel la = new JLabel("안녕하시오");

        ImageIcon im = new ImageIcon("img/katastropi.jpg");
        JLabel imla = new JLabel(im);

        ImageIcon im2 = new ImageIcon("img/bazzi.webp");
        JLabel imla2 = new JLabel("귀여운 뱃찌", im2, SwingConstants.CENTER);

        c.add(la); 
        c.add(imla);
        c.add(imla2);

        setSize(400,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }
}