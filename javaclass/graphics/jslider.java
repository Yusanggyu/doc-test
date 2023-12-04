import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JSlider.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class jslider extends JFrame {
    private Container c;
    private JLabel colorLabel;
    private JSlider [] sl = new JSlider [3];
    public jslider() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(new FlowLayout());

        colorLabel = new JLabel();        
        
        for (int i = 0; i < sl.length; i++) {
            sl[i] = new JSlider(JSlider.HORIZONTAL,0,255,100); // 수평 슬라이더를 0~200까지 만듦. 현재 선택 100

            sl[i].setPaintLabels(true); // 라벨
            sl[i].setPaintTicks(true); // 눈금
            sl[i].setPaintTrack(true); // 트랙
            sl[i].setMajorTickSpacing(50); // 큰 눈금 50
            sl[i].setMinorTickSpacing(10); // 작은 눈금 10
            sl[i].addChangeListener(new MyChangeListener());
            c.add(sl[i]);
        }
        // c.setOpaqu/e(true);
        c.add(colorLabel);
        setSize(260,200);
        setVisible(true);
    }

    class MyChangeListener implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            // TODO Auto-generated method stub
            int r = sl[0].getValue();
            int g = sl[1].getValue();
            int b = sl[2].getValue();

            c.setBackground(new Color(r,g,b));
        }
        
    }
    public static void main(String[] args) {
        jslider mf = new jslider();
    }
}