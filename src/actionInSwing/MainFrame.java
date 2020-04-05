package actionInSwing;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        this.setTitle("Timer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        ActionPanel panel = new ActionPanel();
        this.add(panel);
        this.pack();
        this.setResizable(false);

    }

    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
}
