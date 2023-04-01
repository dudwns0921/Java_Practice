package chapter4_10;

public class EnumTest {
  public static void main(String[] args) {
    BaseballTeam baseballTeam = BaseballTeam.LG;
    System.out.println(baseballTeam.getLose());
    System.out.println(baseballTeam.getWin());
    System.out.println(baseballTeam.getWinsRate());
  }
}
