package flappybird.model;

import java.awt.Color;
import java.lang.Math;

public class Pipe {

  private int posX;
  private int posYTop;
  private int posYBottom;
  private int heightScreen;


  private final static int SPACE = 50;
  private final static int WIDTH = 50;
  private static final Color COLOR = Color.BLACK;
  private static final int speed = 5;


  public Pipe(int whidthScreen, int heightScreen) {
    this.posX = whidthScreen;
    this.heightScreen = heightScreen;
    int tmp = (heightScreen - this.SPACE);
    this.posYTop =  Math.round(Math.round(Math.random() * tmp));
    this.posYBottom = this.posYTop - this.SPACE;
    System.out.println(this.posYBottom);


  }


  public void update() {
    this.posX -= speed;
  }

  public int getPosX() {
    return this.posX;
  }
  public int getPosYTop() {
    return this.posYTop;
  }
  public int getPosYBottom() {
    return this.posYBottom;
  }
  public Color getColor() {
    return this.COLOR;
  }
  public int getWidth() {
    return this.WIDTH;
  }
  public int getHeightScreen() {
    return this.heightScreen;
  }
}
