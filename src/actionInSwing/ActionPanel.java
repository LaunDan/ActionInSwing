package actionInSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionPanel extends JPanel {
    private JButton button;
    private JLabel text;

    public ActionPanel() {
        this.setPreferredSize(new Dimension(300, 400));

        button = new JButton("Button");
        this.add(button);

        ListenerButton listener = new ListenerButton();
        button.addActionListener(listener);

        text = new JLabel("Here is text");
        this.add(text);
    }

    private class ListenerButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            text.setText("You click on the button");
        }
    }


}
