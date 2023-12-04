import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JSlider.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class combo_filed extends JFrame {
    private Container c;
    private JTextField tf = new JTextField(10);
    private String [] name = {};
    public combo_filed() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        
        JComboBox<String> strCombo = new JComboBox<String>(name);

        tf.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    strCombo.addItem(tf.getText());
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
        c.add(tf);
        c.add(strCombo);
        setSize(300,200);
        setVisible(true);
        }

    public static void main(String[] args) {
        combo_filed mf = new combo_filed();
    }
}