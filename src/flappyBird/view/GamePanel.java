package flappybird.view;


import javax.swing.JFrame;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.Timer;

import flappybird.control.GameController;
import flappybird.model.*;



public class GamePanel extends JPanel {

  private Bird bird;
  private ArrayList<Pipe> pipes;

  public GamePanel(Bird bird, ArrayList<Pipe> pipes) {
    this.bird = bird;
    this.pipes = pipes;



  }




  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(this.bird.getColor());
    g2d.fillOval(this.bird.getPosX(), this.bird.getPosY(), this.bird.getSize(), this.bird.getSize());


    for (Pipe elem : pipes) {
      g2d.setColor(elem.getColor());
      g2d.fillRect(elem.getPosX(), elem.getPosYBottom(), elem.getWidth(), elem.getHeightScreen() - elem.getPosYBottom());
      g2d.fillRect(elem.getPosX(), 0, elem.getWidth(), elem.getPosYTop());
    }

  }
}
