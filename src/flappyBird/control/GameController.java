package flappybird.control;

import java.util.ArrayList;

import flappybird.model.*;
import flappybird.view.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameController extends KeyAdapter implements ActionListener {
  private Bird bird;
  private ArrayList<Pipe> pipes;
  private GUI gui;
  private int cpt;


  public GameController(GUI gui) {
    this.gui = gui;

    this.bird = new Bird(this.gui.getHeight());
    this.pipes = new ArrayList<Pipe>();

    this.gui.setBird(this.bird);
    this.gui.setPipes(this.pipes);
    this.cpt = 0;

    System.out.println("Yop");



  }

  public void keyPressed(KeyEvent e) {
    System.out.println("Salut");
    this.bird.flap();

  }

  public void actionPerformed(ActionEvent e) {
    /*if (cpt == 50) {
      this.pipes.add(new Pipe(this.gui.getWidth(), this.gui.getHeight()));
      this.cpt = 0;

    } else {
      this.cpt++;
    }*/
    cpt++;
    System.out.println("cpt = " + cpt);
    bird.update();
    /*ArrayList<Pipe> rmElem = new ArrayList<Pipe>();
    for (Pipe elem : this.pipes) {
      elem.update();
      if (elem.getPosX() < 0) {
        rmElem.add(elem);
      }
    }
    for (Pipe elem : rmElem) {
      this.pipes.remove(elem);
    }*/
    this.gui.getGame().repaint();
  }
}
