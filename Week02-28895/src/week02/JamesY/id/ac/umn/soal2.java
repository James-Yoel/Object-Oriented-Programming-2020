package week02.JamesY.id.ac.umn;

import java.util.Scanner;
public class soal2 {

	public static void main(String[] args) {
		int input;
		int temp;
		int prima = 1;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukan angka : ");
		input = scanner.nextInt();
		
		for(int pembagi = 2; pembagi < input; pembagi++) {
			temp = input % pembagi;
			if(temp == 0) {
				prima = 0;
				break;
			}
		}
		if(prima == 0) {
			System.out.println("Angka" + input + "adalah bukan angka prima");
		}
		else {
			System.out.println("Angka " + input + " adalah angka prima");
		}
	}
}
