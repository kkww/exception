package exception;

//import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		
		try {
			m.dangerMethod(); // throws IOException 이기 때문에
		} catch (MyException e) { // (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);//e.printStackTrace();
		}
	}

}
