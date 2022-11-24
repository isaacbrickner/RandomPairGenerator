import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.*;

public class ListOfPairs extends InitialWindow {

    // private static JDialog listOfPairs;
    private static JPanel textPanel;
    private static JTextArea display;
    private static JScrollPane scroll;

    public ListOfPairs() {

        textPanel = new JPanel();
        textPanel.setBorder(new TitledBorder(new EtchedBorder(), "Display Area"));

        display = new JTextArea(20, 35);
        display.setEditable(false);
        scroll = new JScrollPane(display);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        textPanel.add(scroll);

        JFrame frame = new JFrame();
        frame.add(textPanel);
        frame.pack();
        frame.setLocationRelativeTo(InitialWindow.getInitWindowFrame());
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());
        frame.setSize(getInitWindowFrame().getWidth(), getInitWindowFrame().getHeight());
        frame.setBounds(getInitWindowFrame().getX(), 0, frame.getWidth(), frame.getHeight());

        textPanel = new JPanel();
        textPanel.setBorder(new TitledBorder(new EtchedBorder(), "Display Area"));
        display = new JTextArea(15, 50);
        display.setEditable(false);
        scroll = new JScrollPane(display);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        textPanel.add(scroll);

    }

    // public static String pairs() {
    // // for (int i = 0; i <= RandomGenerator.getPair(i).size(); i++) {
    // // return

    // // }

    // }

    public static JPanel getListOfPairs() {
        return textPanel;
    }
}
