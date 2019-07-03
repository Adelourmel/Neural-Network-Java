package neuralnetwork.test;

import neuralnetwork.Matrix;

public class TestMatrix {
  public static void main(String[] args) {
    Matrix m = new Matrix(5, 8);
    System.out.println(m);
    m.randomize(10);
    System.out.println(m);
    Matrix n = Matrix.transpose(m);
    System.out.println(n);
  }
}
