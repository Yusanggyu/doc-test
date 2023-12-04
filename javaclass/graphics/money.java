import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JSlider.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class money extends JFrame {
    private Container c;
    private JTextField tf = new JTextField(10);
    private JLabel [] moneyla = new JLabel [10];
    private JTextField[] moneytype = new JTextField [10];
    private int[] cnt;
    public money() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        int[] intArray = {50000,10000,5000,1000,500,100,50,10,5,1};

        tf.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    int tfget = Integer.parseInt(tf.getText());
                        for (int i = 0; i < 10; i++) {  
                            if (tfget > intArray[i]) { cnt[i] += tfget / intArray[i]; tfget %= intArray[i]; }
                            else cnt[i] = 0;
                        }
                    tf.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }
        });
        for (int i = 0; i < 10; i++) {
            moneyla[i] = new JLabel(intArray[i]+"원");
            moneytype[i] = new JTextField(cnt[i]);
        }
        setSize(300,200);
        setVisible(true);
        }

    public static void main(String[] args) {
        money mf = new money();
    }
}