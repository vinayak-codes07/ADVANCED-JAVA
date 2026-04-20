/*5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
the concerned color whenever the specific tab is selected in the Pan.*/


package swing;

import javax.swing.*;
import java.awt.*;

public class TabColors {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabbed Colors");
        JTabbedPane tab = new JTabbedPane();

        JPanel red = new JPanel();
        red.setBackground(Color.RED);

        JPanel blue = new JPanel();
        blue.setBackground(Color.BLUE);

        JPanel green = new JPanel();
        green.setBackground(Color.GREEN);

        tab.addTab("RED", red);
        tab.addTab("BLUE", blue);
        tab.addTab("GREEN", green);

        frame.add(tab);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}