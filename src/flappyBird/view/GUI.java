package flappybird.view;

import javax.swing.JFrame;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.Timer;

import flappybird.control.GameController;
import flappybird.model.*;


public class GUI extends JFrame {

  private Bird bird;
  private ArrayList<Pipe> pipes;
  private GameController controller;
  private GamePanel game;

  private final int WIDTH = 1000;
  private final int HEIGHT = 800;

  public GUI() {
    super("Flappy Bird Game");

    setSize(this.WIDTH, this.HEIGHT);


    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    this.controller = new GameController(this);
    this.game = new GamePanel(this.bird, this.pipes);

    add(this.game);

    Timer time = new Timer(20, this.controller);
    time.start();

  }

  public void setBird(Bird bird) {
    this.bird = bird;
  }
  public void setPipes(ArrayList<Pipe> pipes) {
    this.pipes = pipes;
  }

  public int getHeight() {
    return this.HEIGHT;
  }
  public GamePanel getGame() {
    return this.game;
  }

}
