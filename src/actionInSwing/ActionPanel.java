package actionInSwing;

import javax.swing.*;
import java.awt.*;

public class ActionPanel extends JPanel {
    private JButton button;
    private JLabel text;

    public ActionPanel(){
        this.setPreferredSize(new Dimension(300,400));

        button = new JButton("Button");
        this.add(button);

        text = new JLabel("Here is text");
        this.add(text);
    }


}
