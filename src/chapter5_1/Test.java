package chapter5_1;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {

    List<String> list2 = new ArrayList<String>();
    list2.add("hello");
    String s2 = list2.get(0);
    System.out.println(s2);
  }

}
