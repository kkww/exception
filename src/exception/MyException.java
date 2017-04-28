package exception;

public class MyException extends Exception {
	private static final long serialVersionUID = -6672702507525718955L;
	//객체를 네트워크 등으로 전송하는 경우 알아보기 위함(?) 여기서는 경고 없애기 위함
	
	public MyException() {
		super("MyException occurs");
	}
	
	public MyException(String message) {
		super(message);
	}
}
