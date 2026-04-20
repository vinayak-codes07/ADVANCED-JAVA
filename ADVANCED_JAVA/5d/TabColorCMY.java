/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/



package swing;

import javax.swing.*;
import java.awt.*;

public class TabColorCMY {
    public static void main(String[] args) {

        JFrame frame = new JFrame("CMY Colors");
        JTabbedPane tab = new JTabbedPane();

        JPanel cyan = new JPanel();
        cyan.setBackground(Color.CYAN);

        JPanel magenta = new JPanel();
        magenta.setBackground(Color.MAGENTA);

        JPanel yellow = new JPanel();
        yellow.setBackground(Color.YELLOW);

        tab.addTab("Cyan", cyan);
        tab.addTab("Magenta", magenta);
        tab.addTab("Yellow", yellow);

        frame.add(tab);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}