package chapter5_7;

public class LambdaTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    MyInterface1 myInterface1, myInterface2;
    MyInterface2 myInterface3, myInterface4;
    myInterface1 = (int a, int b) -> System.out.println(a + b);
    myInterface2 = (int a, int b) -> System.out.println(a - b);
    myInterface3 = (int a) -> System.out.println(a + 1);
    myInterface4 = (int a) -> System.out.println(a - 1);
    myInterface1.method(3, 5);
    myInterface2.method(13, 5);
    myInterface3.method(3);
    myInterface4.method(13);

  }

}
