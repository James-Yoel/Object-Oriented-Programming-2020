package soal3;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		try {
			int a[] = new int [5];
			//Terjadi pengaksesan index array yang melewati batas array tersebut
			a[7] = 7;
			System.out.println("Hasil a[7] adalah "+a[7]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index array melewati batas!");
		}
	}
}
