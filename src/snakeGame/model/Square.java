package snakegame.model;

import java.awt.Color;



public class Square {
  private int posX;
  private int posY;

  private final static int SIZE = 50;
  private final static Color color = Color.BLUE;

  public Square(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
  }

  public int getPosX() {
    return this.posX;
  }
  public int getPosY() {
    return this.posY;
  }
  public void setPos(int x, int y) {
    this.posX = x;
    this.posY = y;
  }

  public Color getColor() {
    return this.color;
  }


  public int getSize() {
    return this.SIZE;
  }
}
