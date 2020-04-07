package actionInSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ActionPanel extends JPanel {
    private String text = "Laun";
    private int x, y;
    private int directionX, directionY;
    private int widthText;
    private int heightText;

    public ActionPanel() {
        this.x = (200 - widthText);
        this.y = (150 - heightText);
        this.directionX = 1;
        this.directionY = 1;
        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.YELLOW);

        Font font = new Font("Monospaced", Font.BOLD, 40);
        this.setFont(font);
        FontMetrics fm = this.getFontMetrics(font);
        widthText = fm.stringWidth(text);
        heightText = fm.getHeight();

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



        if (x >= (this.getWidth() - widthText) || x <= 0){
            directionX = -directionX;
        }
        if (y >= (this.getHeight()) || (y <= (heightText - 30))){
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
