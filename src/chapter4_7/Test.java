package chapter4_7;

public class Test {

  public static void main(String[] args) {
    Computer computer;
    computer = new PersonalComputer();
    computer.calculate("1");
    computer = new Workstation();
    computer.calculate("2");
  }

}
