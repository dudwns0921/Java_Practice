package chapter4_4;

import lombok.Getter;

@Getter
public class Triangle implements Figure {
  private double width, height;

  public Triangle(double h, double w) {
    this.width = w;
    this.height = h;
  }

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return this.width * this.height * 0.5;
  }

}
