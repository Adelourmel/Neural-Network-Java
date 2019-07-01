package snakegame.model;

public enum Direction {

  LEFT(Snake.getCoeffTab(0)),
  RIGTH(Snake.getCoeffTab(0)),
  TOP(Snake.getCoeffTab(0)),
  BOTTOM(Snake.getCoeffTab(0));

  private int[] coeff;

  private Direction(int[] coeff) {
    this.coeff = coeff;
  }


  public int[] getCoeff() {
    return this.coeff;
  }
}
