/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
implementing the event handling mechanism with addActionListener( ).*/



package swing;

import javax.swing.*;
import java.awt.event.*;

public class ImageButtonDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Button Demo");

        ImageIcon clock = new ImageIcon("C:\\Users\\atpug\\Downloads\\clock.jpeg");
        ImageIcon hourglass = new ImageIcon("C:\\Users\\atpug\\Downloads\\hour glass.jpeg");

        JButton b1 = new JButton("Digital Clock", clock);
        JButton b2 = new JButton("Hour Glass", hourglass);

        JLabel label = new JLabel();

        b1.setBounds(30, 100, 150, 100);
        b2.setBounds(200, 100, 150, 300);
        label.setBounds(100, 500, 300, 100);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.add(b1);
        frame.add(b2);
        frame.add(label);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}