package chapter4_8;

public class MyComputer extends Computer implements Calculator {

  public MyComputer(int nInputHDDCapacity, int nInputMemoryCapacity) {
    super(nInputHDDCapacity, nInputMemoryCapacity);
  }

  @Override
  public void calculate(String order) {
    System.out.println("MyComputer :" + order);
  }
}
