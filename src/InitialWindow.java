import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class InitialWindow implements ActionListener {

    private static JFrame initWindowFrame;
    private static JLabel initLabel;
    private static JButton yesButton;
    private static ListOfPairs newWindow;

    public InitialWindow() {
        initWindowFrame = new JFrame("Random Pair Generator"); // TODO: find scalable scren size method and or variable
        initLabel = new JLabel(InitialInput.initialPrompt(), SwingConstants.CENTER);
        yesButton = new JButton("Yes");

        initWindowFrame.add(initLabel);
        initWindowFrame.setBounds(400, 0, 350, 200);
        initWindowFrame.setLayout(new FlowLayout());
        initWindowFrame.setVisible(true);
        initWindowFrame.add(yesButton);

        initLabel.setBounds(0, SwingConstants.LEADING, initWindowFrame.getWidth(), 50);
        yesButton.setBounds((initWindowFrame.getWidth() / 2) - 25, initWindowFrame.getHeight() / 2, 50, 50);
        yesButton.addActionListener(this);
        initWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        RandomGenerator.loadFiles();
        RandomGenerator.scrambleNames();
        initWindowFrame.dispose();
        newWindow = new ListOfPairs();
        ListOfPairs.getTextPanel().setVisible(true);
    }

    public static JFrame getInitWindowFrame() {
        return initWindowFrame;
    }

}
