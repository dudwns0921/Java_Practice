package chapter8_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader bufferedReader = null;
    PrintWriter printWriter = null;

    try {
      bufferedReader = new BufferedReader(new FileReader("chpater8_2/reader.txt"));
      printWriter = new PrintWriter("chpater8_2/printWriter.txt");
      String l;
      while ((l = bufferedReader.readLine()) != null) {
        System.out.println(l);
        printWriter.write(l);
      }
    } finally {
      if (bufferedReader != null) {
        bufferedReader.close();
      }
      if (printWriter != null) {
        printWriter.close();
      }
      System.out.println("복사 종료");
    }

  }

}
