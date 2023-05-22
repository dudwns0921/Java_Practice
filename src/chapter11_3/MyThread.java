package chapter11_3;

public class MyThread extends Thread {
  public MyThread(String szName) {
    super(szName);
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(super.getName());
    }
  }
}
