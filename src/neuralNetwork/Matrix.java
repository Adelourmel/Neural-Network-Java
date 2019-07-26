package neuralnetwork;

import java.lang.Math;

public class Matrix extends MathF {

  private int nbCols;
  private int nbRows;
  private double[][] data;

  public Matrix(int nbRows, int nbCols) {

    if (nbCols >= 0 && nbRows >= 0) {
      this.nbCols = nbCols;
      this.nbRows = nbRows;

    }
    else {
      System.err.println("Matrix object constructor nbCols or/and nbRows ");
    }


    this.data = new double[this.nbCols][this.nbRows];
  }

  public Matrix(double[][] array) {
    if (array != null) {
      this.data = array;
      this.nbCols = array.length;
      if (nbCols != 0) {
        this.nbRows = array[0].length;
      }
    }
    else {
      System.err.println("Matrix constructor incompatible data");
    }
  }

  public void randomize(int maxVal) {
    for (int i = 0 ; i < this.data.length ; i++) {
      for (int j = 0 ; j < this.data[i].length ; j++) {
        this.data[i][j] = Math.random() * maxVal;
      }
    }
  }
  public static Matrix transpose(Matrix a) {
    Matrix ret = new Matrix(a.nbCols, a.nbRows);

    for (int i = 0 ; i < a.data.length ; i++) {
      for (int j = 0 ; j < a.data[i].length ; j++) {
        ret.data[j][i] = a.data[i][j];
      }
    }

    return ret;
  }

  public static Matrix multiply(Matrix a, Matrix b) {
    Matrix ret;
    if (a.nbRows == b.nbCols) {
      ret = new Matrix(b.nbRows, a.nbCols);

      for (int i = 0 ; i < b.data.length ; i++) {

        int sum = 0;

        for (int j = 0 ; j < b.data[i].length ; j++) {
          for (int c = 0 ; c < a.data[i].length ; c++) {
            sum += a.data[i][j] * b.data[j][c];

          }
          ret.data[i][j] = sum;
        }
      }

    }
    else {
      System.err.println("Matrix, multiply incorect matrix dimension incompatible");
      ret = null;
    }

    return ret;
  }





  public String toString() {
    String ret = "";

    for (int i = 0 ; i < this.data.length ; i++) {
      for (int j = 0 ; j < this.data[i].length ; j++) {
        ret += this.data[i][j] + "\t";
      }
      ret += "\n";
    }

    return ret;


  }



  public static Matrix map(Matrix matrix, MathFunction mathFunc) {
    Matrix ret = new Matrix(matrix.nbRows, matrix.nbCols);
    for (int i = 0 ; i < matrix.data.length ; i++) {
      for (int j = 0 ; j < matrix.data[i].length ; j++) {
        ret.data[i][j] =  mathFunc.f(matrix.data[i][j]);
      }
    }
    return ret;
  }


  public double[][] getMatrix() {
    return this.data;
  }
}
