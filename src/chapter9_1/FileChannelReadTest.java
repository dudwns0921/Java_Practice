package chapter9_1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelReadTest {

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("chapter9_1/input.txt");
    FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);

    ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024);
    Charset charset = Charset.defaultCharset();

    StringBuffer stringBuffer = new StringBuffer();

    while (fileChannel.read(buffer) > 0) {
      // fileChannel의 read 메서드로 buffer 만큼 fileChannel을 통해 연결된 파일에서 가져온 데이터를 바이트 형태로 buffer에 기록한다.
      // 그 다음 filp 메서드를 통해 기록한 만큼 이동한 포지션을 다시 처음으로 바꾼다.
      buffer.flip();
      stringBuffer.append(charset.decode(buffer));
      buffer.clear();
    }
    System.out.print(stringBuffer);
    fileChannel.close();

  }

}
