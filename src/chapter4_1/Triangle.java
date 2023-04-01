package chapter4_1;

public class Triangle extends Shape {
  public Triangle(double h, double w) {
    super(h, w);
  }

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return super.getWidth() * super.getHeight() * 0.5;
  }
}
