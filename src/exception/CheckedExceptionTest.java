package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println("ㅈㅅ");
			System.out.println(e);
			//e.printStackTrace();
			return;
		}
		
	}

}
