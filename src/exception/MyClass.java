package exception;

//import java.io.IOException;

public class MyClass {
	public void dangerMethod() throws MyException { // throws IOException {
								//실행 중 exception을 throw할 수 있는 method라는 표시
		int i = 10;
		if(i == 8+2) {
			//위험한 경우(예외 상황 발생)
			throw new MyException(); // IOException("IOException 발생");
		}
		
		System.out.println("정상 실행");
	}
}
