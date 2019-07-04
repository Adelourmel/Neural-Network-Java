package neuralnetwork;

import java.lang.Math;

public class MathF {
  public final static MathFunction SIGMOID = (new MathFunction() {
    @Override
    public double f(double x) {
      return 1/(1 + Math.expm1(x));
    }
  });

  public final static MathFunction SQUARE = (new MathFunction() {
    @Override
    public double f(double x) {
      return x*x;
    }
  });



  public interface MathFunction {
    public double f(double x);
  }



}
