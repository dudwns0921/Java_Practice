package chapter11_5;

public class JoinTest {

  public static void main(String[] args) throws InterruptedException {
    Thread my_Thread1 = new Thread(new MyThread(), "thd1");
    Thread my_Thread2 = new Thread(new MyThread(), "thd2");

    my_Thread1.start();
    my_Thread2.start();

    my_Thread1.join();
    my_Thread2.join();

    System.out.println("main thread");
  }

}
