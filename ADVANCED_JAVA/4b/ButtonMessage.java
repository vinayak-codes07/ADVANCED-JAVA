/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed”
depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling
mechanism with addActionListener( ).*/

package swing;

import javax.swing.*;
import java.awt.event.*;

public class ButtonMessage {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Demo");
        JButton b1 = new JButton("Srilanka");
        JButton b2 = new JButton("India");
        JLabel label = new JLabel();

        b1.setBounds(50, 50, 100, 30);
        b2.setBounds(200, 50, 100, 30);
        label.setBounds(50, 120, 250, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        frame.add(b1);
        frame.add(b2);
        frame.add(label);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}