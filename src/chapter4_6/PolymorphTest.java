package chapter4_6;

public class PolymorphTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    A a = new B();
    a.func();
    a = new C();
    a.func();
  }

}
