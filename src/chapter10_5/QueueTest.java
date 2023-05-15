package chapter10_5;

import java.util.LinkedList;

public class QueueTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    LinkedList<String> queue = new LinkedList<>();
    queue.offer("one");
    queue.offer("two");
    queue.offer("three");
    queue.offer("four");

    String string = queue.poll();
    while (string != null) {
      System.out.println(string);
      string = queue.poll();
    }
  }

}
