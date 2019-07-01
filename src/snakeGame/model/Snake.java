package snakegame.model;


import java.util.ArrayList;

public class Snake {
  private ArrayList<Square> body;
  private Direction direction;
  private static int[][] COEFFTAB = {{0,1}, {1,0}, {0, -1}, {-1, 0}};


  public Snake() {
    this.body = new ArrayList<Square>();
    this.direction = Direction.TOP;
  }



  public ArrayList<Square> getBody() {
    return this.body;
  }

  public void move() {

  }


  public int growth() {

    int pX = 0;
    int pY = 0;


    this.body.add(new Square(pX, pY));


    return 0;
  }

  public boolean isDead() {
    return true;
  }

  public static int[] getCoeffTab(int index) {
    return COEFFTAB[index];
  }

  public void setDirection(Direction newDirection) {
    this.direction = newDirection;
  }
}
