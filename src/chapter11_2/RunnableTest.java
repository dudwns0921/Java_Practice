package chapter11_2;

public class RunnableTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Thread my_Thread = new Thread(new MyThread());
    my_Thread.start();
  }

}
