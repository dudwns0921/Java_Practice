package chapter11_7;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SharedResource sResource = new SharedResource();
    MyThread[] myThreads = new MyThread[10];
    for (int i = 0; i < myThreads.length; i++) {
      myThreads[i] = new MyThread("td" + i, sResource);
      myThreads[i].start();
    }
  }

}
