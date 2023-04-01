package chapter3_7;

public class CSub extends CSuper {
  public double x;

  public CSub(double new_x) {
    this.x = new_x;
    super.x = new_x * 10;
  }

  public double getSuper() {
    return super.x;
  }

  public double getSub() {
    return this.x;
  }
}
