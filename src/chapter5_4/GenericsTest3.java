package chapter5_4;

public class GenericsTest3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Data<String> data = new Data<String>("hello");
    String string = "bye";
    data.setT(string);
    System.out.println(data.getT());

  }

}
