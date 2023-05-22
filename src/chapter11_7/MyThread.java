package chapter11_7;

public class MyThread extends Thread {

  static SharedResource sResource;
  String szName;

  public MyThread(String szName, SharedResource sr) {
    super(szName);
    this.szName = szName;
    this.sResource = sr;
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      sResource.incRes(szName);
    }
  }



}
