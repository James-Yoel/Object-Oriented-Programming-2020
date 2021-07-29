package soal5;

public class TryCatchFinally {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 5;
		try {
			int result = a / (b - c);
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
		}
		finally {
			System.out.println("Program Finish!");
		}
	}

}
