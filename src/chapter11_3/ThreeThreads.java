package chapter11_3;

public class ThreeThreads {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    MyThread myThread1 = new MyThread("thd1");
    MyThread myThread2 = new MyThread("thd2");
    MyThread myThread3 = new MyThread("thd3");

    myThread1.start();
    myThread2.start();
    myThread3.start();

  }

}
