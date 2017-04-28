package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		int result = 0;
		
		try {
			System.out.println("start try"); //1
			result = 100/a; //2
			System.out.println("some codes...");
		} catch(ArithmeticException e) { //3
			System.out.println("ㅈㅅ"); //4
			System.out.println(e); //5 //e.printStackTrace();
		} finally {
			System.out.println("자원 정리"); //6
		}
		
		System.out.println(result);
		//return;
	}

}
