package snakegame.model;

import java.util.ArrayList;

public class Grid {

  private Snake snake;
  private ArrayList<Food> foods;

  public Grid() {
    this.snake = new Snake();
  }
}
