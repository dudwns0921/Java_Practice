package chapter10_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<String> names = new ArrayList<>();
    Map<String, Integer> lectures;
    Map<String, Map> scores = new HashMap<>();

    names.add("김철수");
    names.add("김영희");

    Iterator<String> iterator = names.iterator();

    while (iterator.hasNext()) {
      String name = iterator.next();
      if (name == "김철수") {
        lectures = new HashMap<String, Integer>();
        lectures.put("국어", 100);
        lectures.put("영어", 95);
        lectures.put("수학", 80);
        scores.put(name, lectures);
      } else {
        lectures = new HashMap<String, Integer>();
        lectures.put("국어", 90);
        lectures.put("영어", 95);
        lectures.put("수학", 95);
        scores.put(name, lectures);

      }
    }

    iterator = names.iterator();

    while (iterator.hasNext()) {
      String name = iterator.next();
      System.out.println(name);
      System.out.println("국어 : " + scores.get(name).get("국어"));
      System.out.println("영어 : " + scores.get(name).get("영어"));
      System.out.println("수학 : " + scores.get(name).get("수학"));


    }
  }

}
