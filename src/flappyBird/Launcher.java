package flappybird;


import flappybird.view.GUI;

public class Launcher {
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        GUI g = new GUI();
      }
    });
  }
}
