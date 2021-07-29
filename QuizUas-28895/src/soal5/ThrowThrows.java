package soal5;

public class ThrowThrows {
	
	static void helloWorld() throws IllegalAccessException{
		System.out.println("Hello World!");
		throw new IllegalAccessException("You cannot access helloWorld!");
	}

	public static void main(String[] args) {
		try {
			helloWorld();
		}
		catch(IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
	}

}
