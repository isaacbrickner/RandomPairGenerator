import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class ListOfPairs extends InitialWindow {

    private static JPanel textPanel;
    private static JTextArea display;
    private static JScrollPane scroll;

    public ListOfPairs() {
        // create text panel and border
        textPanel = new JPanel();
        textPanel.setBorder(new TitledBorder(new EtchedBorder(), "List of random pairs"));
        // create the display area where the text will reside with scroll bar component
        display = new JTextArea(25, 35);
        append();
        display.setEditable(false);
        scroll = new JScrollPane(display);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        textPanel.add(scroll);
        // create JFrame to host text area and panel
        JFrame frame = new JFrame();
        frame.add(textPanel);
        frame.pack();
        frame.setLocationRelativeTo(InitialWindow.getInitWindowFrame());
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setBounds(getInitWindowFrame().getX(), 0, frame.getWidth(), frame.getHeight());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JPanel getTextPanel() {
        return textPanel;
    }

    public static void append() {
        for (int i = 0; i < RandomGenerator.getNamePairing().size(); i++) {
            display.append(RandomGenerator.getNamePairing().get(i));
        }
    }

}
