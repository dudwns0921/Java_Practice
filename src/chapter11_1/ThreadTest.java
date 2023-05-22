package chapter11_1;

public class ThreadTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    MyThread myThread = new MyThread();
    // run 메소드를 호출하지 않도록 주의
    myThread.start();
  }

}
