package chapter4_7;

public class PersonalComputer implements Computer {
  @Override
  public void calculate(String order) {
    System.out.println("Personal Computer: " + order);
  }
}
