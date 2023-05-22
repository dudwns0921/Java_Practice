package chapter11_7;

public class SharedResource {
  int nRes = 0;

  public synchronized void incRes(String szThdName) {
    try {
      Thread.sleep(2);
    } catch (Exception e) {
      // TODO: handle exception
    }
    nRes++;
    System.out.println(String.format("[%s] : %d", szThdName, nRes));
  }
}
