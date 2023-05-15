package chapter10_2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<String> list = new ArrayList<String>();

    list.add("one");
    list.add("two");
    list.add("three");
    list.add(1, "one");
    list.add("five");

    System.out.println(list.size());
    System.out.println(list.indexOf("one"));
    System.out.println(list.lastIndexOf("one"));


  }

}
