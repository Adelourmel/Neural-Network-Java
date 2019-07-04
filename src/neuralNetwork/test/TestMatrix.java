package neuralnetwork.test;

import neuralnetwork.Matrix;
import neuralnetwork.MathF;

public class TestMatrix {
  public static void main(String[] args) {
    Matrix m = new Matrix(5, 3);
    System.out.println(m);
    m.randomize(10);
    System.out.println(m);
    Matrix n = Matrix.transpose(m);
    System.out.println(n);
    Matrix p = Matrix.map(n, MathF.SQUARE);
    System.out.println(p);
  }
}
