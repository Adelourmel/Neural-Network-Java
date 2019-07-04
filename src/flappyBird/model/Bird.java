package flappybird.model;

import java.awt.Color;
import java.lang.Math;


public class Bird {

  private final static int SIZE = 20;
  private final static int FLAPCOEFF = 30;
  private final static double gravity = 0.51;
  private final static Color COLOR = Color.BLACK;

  private final static int posX = 50;
  private int posY;
  private int velocity;


  public Bird(int height) {
    this.posY = height/2;
    this.velocity = 0;

  }


  public void flap() {
    this.velocity = this.FLAPCOEFF;
  }

  public void update() {
    this.velocity = Math.round(Math.round(this.velocity+gravity));
    this.posY += this.velocity;
  }

  public int getPosX() {
    return this.posX;
  }

  public int getPosY() {
    return this.posY;
  }


  public int getSize() {
    return  Bird.SIZE;
  }

  public Color getColor() {
    return Bird.COLOR;
  }
}
