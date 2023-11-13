import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class name extends JFrame {
    public name() {
    setTitle("yusanggyu");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();

    c.setLayout(new FlowLayout());

    JButton b = new JButton("유상규");
    c.add(b);

    JLabel la = new JLabel("유상규");
    la.setLocation(30, 30);
    c.addMouseListener(new MouseListener() {
        public void mouseClicked(MouseEvent e) {

        }
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x,y);
        }

        public void mouseReleased(MouseEvent e) {

        }
        public void mouseEntered(MouseEvent e) {

        }
        public void mouseExited(MouseEvent e) {

        }
    });
    setSize(300,200);
    setVisible(true);
    }

public static void main(String[args]) {
    name mf = new name();
    }
}
