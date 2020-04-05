package actionInSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.spec.KeySpec;

public class ActionPanel extends JPanel {
    private long counter;
    private JLabel text;

    public ActionPanel() {
        this.counter = 0;
        this.setPreferredSize(new Dimension(80, 30));

        text = new JLabel();
        this.add(text);
        text.setText(String.valueOf(counter));

        ListenerOfPanel listener = new ListenerOfPanel();
        Timer timer = new Timer(10, listener);
        timer.start();

    }

    private class ListenerOfPanel implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            counter++;
            text.setText(String.valueOf(counter));
        }

    }


}
