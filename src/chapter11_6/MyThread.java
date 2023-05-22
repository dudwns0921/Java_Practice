package chapter11_6;

public class MyThread extends Thread {
  Thread thdNext = null;

  public MyThread(String szName) {
    super(szName);
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        // TODO: handle exception
        System.out.println(getName());
        if (thdNext.isAlive()) {
          thdNext.interrupt();
        }
      }
    }
  }

  public void setNextThread(Thread thread) {
    thdNext = thread;
  }
}
