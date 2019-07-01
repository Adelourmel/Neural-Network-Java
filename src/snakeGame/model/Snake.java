package snakegame.model;


import java.util.ArrayList;

public class Snake {
  private ArrayList<Square> body;

  public Snake() {
    this.body = new ArrayList<Square>();



  }



  public ArrayList<Square> getBody() {
    return this.body;
  }


  public int growth() {

    int pX = 0;
    int pY = 0;


    this.body.add(new Square(pX, pY));


    return 0;
  }
}
