package chapter4_8;

public class Test {

  public static void main(String[] args) {
    MyComputer myComputer = new MyComputer(500, 32);
    myComputer.calculate("1");
    System.out.println(myComputer.getNHDDCapacity());
    System.out.println(myComputer.getNMemoryCapacity());

  }

}
