package snakegame.model;

import java.util.ArrayList;

public class Grid {

  private Snake snake;
  private ArrayList<Food> foods;

  public Grid() {
    this.snake = new Snake();
  }

  public Snake getSnake() {
    return this.snake;
  }

  public ArrayList<Food> getFoods() {
    return this.foods;
  }
}
