package chapter10_1;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Set<String> set = new HashSet<String>();

    set.add("one");
    set.add("two");
    set.add("three");
    set.add("four");

    System.out.println(set.add(new String("one"))); // 이미 가지고 있기 때문에 false 반환

    System.out.println(set.size()); // 4

  }

}
