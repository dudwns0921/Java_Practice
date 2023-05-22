package chapter11_6;

public class Test6 {

  public static void main(String[] args) {
    MyThread myThread1 = new MyThread("thd1");
    MyThread myThread2 = new MyThread("thd2");
    MyThread myThread3 = new MyThread("thd3");

    myThread1.setNextThread(myThread2);
    myThread2.setNextThread(myThread3);
    myThread3.setNextThread(myThread1);

    myThread1.start();
    myThread2.start();
    myThread3.start();

    try {
      myThread1.interrupt();
      myThread1.join();
      myThread2.join();
      myThread3.join();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
    }
    System.out.println("out");
  }

}
