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



  public boolean move() {

    boolean ret = false;

    int index = this.body.size() - 1;
    Square tmp = this.body.remove(index);

    int newPosX = this.direction.getCoeff()[0] + this.body.get(0).getPosX();

    int newPosY = this.direction.getCoeff()[1] + this.body.get(0).getPosY();

    if (!isDead(newPosX, newPosY)) {
      tmp.setPos(newPosX, newPosY);
      this.body.add(0, tmp);
      ret = true;
    }
    return ret;
  }


  public void growth(int pX, int pY) {
    this.body.add(new Square(pX, pY));
  }

  public boolean isDead(int newPosX, int newPosY) {
    return true;
  }

  public static int[] getCoeffTab(int index) {
    return COEFFTAB[index];
  }

  public void setDirection(Direction newDirection) {
    this.direction = newDirection;
  }
  public ArrayList<Square> getBody() {
    return this.body;
  }
}
