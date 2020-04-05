package actionInSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionPanel extends JPanel {
    private String text = "TEXT";
    private int x, y;
    private int directionX, directionY;

    public ActionPanel() {
        this.x = 0;
        this.y = 0;
        this.directionX = 1;
        this.directionY = 1;
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.green);

        Font font = new Font("Monospaced", Font.BOLD, 40);
        this.setFont(font);

        Timer timer = new Timer(20, new ListenerOfPanel());
        timer.start();

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawString(text, x, y);
    }

   
    private void move(){
        x += directionX;
        y += directionY;

        if (x >= this.getWidth() || x <= 0){
            directionX = -directionX;
        }
        if (y >= this.getHeight() || (y <= 0)){
            directionY = -directionY;
        }
    }

    private class ListenerOfPanel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e){
            move();
            repaint();
        }

    }


}
