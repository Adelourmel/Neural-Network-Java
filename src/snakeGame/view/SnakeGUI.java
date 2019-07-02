package snakegame.view;

import snakegame.model.*;


import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class SnakeGUI extends JPanel {

  private Grid grid;

  public SnakeGUI(Grid grid) {
    this.grid = grid;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;

    drawSnake(this.grid.getSnake(), g2d);
    drawFood(this.grid.getFoods(), g2d);
  }


  private void drawSnake(Snake snake, Graphics2D g2d) {
    for (Square elem : snake.getBody()) {
      g2d.setColor(elem.getColor());

      int sizeSquare = elem.getSize();

      g2d.fillRect(elem.getPosX() * sizeSquare, elem.getPosY() * sizeSquare, sizeSquare, sizeSquare);
    }
  }


  private void drawFood(ArrayList<Food> food, Graphics2D g2d) {

  }



}
