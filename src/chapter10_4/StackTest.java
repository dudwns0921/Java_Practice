package chapter10_4;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    LinkedList<String> stack = new LinkedList<>();

    stack.push("one");
    stack.push("two");
    stack.push("three");
    stack.push("four");

    try {
      while (true)
        System.out.println(stack.pop());
    } catch (NoSuchElementException e) {
      // TODO: handle exception
      System.out.println("stack is empty");
    }
  }

}
