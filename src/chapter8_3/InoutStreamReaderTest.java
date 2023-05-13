package chapter8_3;

import java.io.IOException;
import java.io.InputStreamReader;

public class InoutStreamReaderTest {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    int i;
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    while ((i = inputStreamReader.read()) != '끝') {
      System.out.print((char) i);
    }
  }

}
