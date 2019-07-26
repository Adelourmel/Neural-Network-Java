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
    System.out.println("Test multiply");
    testMultiply();

  }


  public static void testMultiply() {


    double[][] tm = {  {1.1, 2.1, 3.2},
                    {2.1, 3.1, 4.2},
                    {5.1, 6.1, 3.0}};
    Matrix m = new Matrix(tm);
    Matrix n = new Matrix(5,3);
    n.randomize(10);

    System.out.println(n);
    System.out.println("HERE : " + m);


    Matrix t = Matrix.multiply(m,n);

    System.out.println(t);

  }


}
