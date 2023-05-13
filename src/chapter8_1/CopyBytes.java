package chapter8_1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		try {
			inputStream = new FileInputStream("./chapter8_1/input.txt");
			outputStream = new FileOutputStream("./chapter8_1/output.txt");
			int c;
			while((c=inputStream.read())!=-1) {
				// 바이트는 일반적으로 8비트로 구성된 디지털 정보의 단위
				// 비트는 컴퓨터 시스템에서 가장 작은 정보 단위로 0 또는 1의 이진수를 나타냄
				// 바이트는 문자, 정수, 부동 소수점 숫자 및 이진 데이터를 포함하여 광범위한 데이터 유형을 나타내는 데 사용
				System.out.println(c);
				outputStream.write(c);
			}
		} finally {
			if(inputStream!=null) {
				inputStream.close();
			}
			if(outputStream!=null) {
				outputStream.close();
			}
			System.out.println("복사 종료");
		}	
	}
}
