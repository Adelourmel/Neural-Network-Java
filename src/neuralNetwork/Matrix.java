package neuralnetwork;

public class Matrix {

  private int nbCols;
  private int nbRows;
  private float[][] data;

  public Matrix(int nbCols, int nbRows) {

    if (nbCols >= 0 && nbRows >= 0) {
      this.nbCols = nbCols;
      this.nbRows = nbRows;

    }
    else {
      System.err.println("Matrix object constructor nbCols or/and nbRows ");
    }


    this.data = new float[this.nbRows][this.nbCols];
  }

  public void randomize(int maxVal) {
    for (int i = 0 ; i < this.data.length ; i++) {
      for (int j = 0 ; j < this.data[i].length ; j++) {
        this.data[i][j] = (float) Math.random() * maxVal;
      }
    }
  }
  public static Matrix transpose(Matrix a) {
    Matrix ret = new Matrix(a.nbRows, a.nbCols);

    for (int i = 0 ; i < a.data.length ; i++) {
      for (int j = 0 ; j < a.data[i].length ; j++) {
        ret.data[j][i] = a.data[i][j];
      }
    }

    return ret;
  }

  public static Matrix multiply(Matrix a, Matrix b) {
    Matrix ret;
    if (a.nbCols == b.nbRows && a.nbRows == b.nbCols) {
      ret = new Matrix(a.nbRows, b.nbCols);
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


  public float[][] getMatrix() {
    return this.data;
  }
}
