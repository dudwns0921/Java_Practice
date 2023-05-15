package chapter10_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<String> list = new ArrayList<>();

    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
    list.add("five");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    for (String string : list) {
      System.out.println(string);
    }

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}
