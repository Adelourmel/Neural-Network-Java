package snakegame.model;

import java.awt.Color;


public class Food {
  private int posX;
  private int posY;

  private final static Color COLOR = Color.RED;
  private final static int SIZE = 45;

  public Food(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
  }


  public int getPosX() {
    return this.posX;
  }
  public int getSize() {
    return this.SIZE;
  }
  public int getPosY() {
    return this.posY;
  }
  public Color getColor() {
    return this.COLOR;
  }





}
