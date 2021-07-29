package soal3;

public class Arithmetic {

	public static void main(String[] args) {
		try {
			int a = 30, b = 0;
			//Terjadi pembagian angka dengan 0
			int c = a/b; 
			System.out.println("Hasil c adalah "+c);
		}
		catch (ArithmeticException e) {
			System.out.println("Tidak bisa dibagi dengan 0!");
		}
	}

}
