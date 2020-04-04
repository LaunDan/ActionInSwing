package actionInSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.spec.KeySpec;

public class ActionPanel extends JPanel {
    private JButton button;
    private JLabel text;

    public ActionPanel() {
        this.setPreferredSize(new Dimension(300, 30));


        text = new JLabel("Here is text");
        this.add(text);



        ListenerOfPanel listener = new ListenerOfPanel();
        this.addKeyListener(listener);

        this.setFocusable(true);
    }

    private class ListenerOfPanel implements KeyListener {
        @Override
        public void keyPressed(KeyEvent e){
            text.setText("You click on the keyboard " + e.getKeyChar());
        }

        @Override
        public void keyReleased(KeyEvent e){
            text.setText("You released the key which code is " + e.getKeyCode());
        }

        @Override
        public void keyTyped(KeyEvent e){
            //is only generated if valid Unicode character could be generated
        }
    }


}
