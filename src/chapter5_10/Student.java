package chapter5_10;

import lombok.Getter;

@Getter
public class Student {
  private String name;
  private int year;

  public Student(String name, int year) {
    // TODO Auto-generated constructor stub
    this.name = name;
    this.year = year;
  }

}
