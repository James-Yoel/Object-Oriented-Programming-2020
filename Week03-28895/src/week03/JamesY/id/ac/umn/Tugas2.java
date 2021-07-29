package week03.JamesY.id.ac.umn;

import java.util.Scanner;

public class Tugas2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan Nama Anda : ");
		final String nama = scanner.nextLine();
		System.out.println("----------------------------------\nString anda : " + nama);
		System.out.println("1. charAt\t\t2. length\n3. substring(n)\t\t4. substring(m,n)\n5. contains\t\t6. concat\n7. replace\t\t8. split\n9. lowerCase\t\t10. upperCase\nPilih menu : ");
		int input = scanner.nextInt();
		int inputA;
		int inputB;
		String inputS;
		String inputS2;
		
		switch(input) {
		case 1 : System.out.println("-----charAt-----\nNama : " + nama + "\nInput : ");
		input = scanner.nextInt();
		System.out.println("Hasil: " + nama.charAt(input)); break;
		
		case 2 : System.out.println("-----length-----\nNama : " + nama);
		System.out.println("Hasil: " + nama.length()); break;
		
		case 3 : System.out.println("-----substring(n)-----\nNama : " + nama + "\nInput : ");
		input = scanner.nextInt();
		System.out.println("Hasil: " + nama.substring(input)); break;
		
		case 4 : System.out.println("-----substring(m,n)-----\nNama : " + nama + "\nInput mulai: ");
		inputA = scanner.nextInt();
		System.out.println("Input akhir : ");
		inputB = scanner.nextInt();
		System.out.println("Hasil: " + nama.substring(inputA, inputB)); break;
		
		case 5 : System.out.println("-----contains-----\nNama : " + nama + "\nInput : ");
		scanner.nextLine();
		inputS = scanner.nextLine();
		System.out.println("Hasil : " + nama.contains(inputS)); break;
		
		case 6 : System.out.println("-----concat-----\nNama : " + nama + "\nInput : ");
		scanner.nextLine();
		inputS = scanner.nextLine();
		System.out.println("Hasil : " + nama.concat(inputS)); break;
		
		case 7 : System.out.println("-----replace-----\nNama : " + nama + "\nInput kata yang diganti : ");
		scanner.nextLine();
		inputS = scanner.nextLine();
		System.out.println("Input kata pengganti : ");
		inputS2 = scanner.nextLine();
		System.out.println("Hasil : " + nama.replace(inputS, inputS2)); break;
		
		case 8 : System.out.println("-----split-----\nNama : " + nama + "\nInput : ");
		scanner.nextLine();
		inputS = scanner.nextLine();
		String[] arrInputS = nama.split(inputS);
		for (String hasil : arrInputS) {
			System.out.println("Hasil : " + hasil);
		} break;
		
		case 9 : System.out.println("-----lowerCase-----\nNama : " + nama);
		System.out.println("Hasil : " + nama.toLowerCase()); break;
		
		case 10 : System.out.println("-----upperCase-----\nNama : " + nama);
		System.out.println("Hasil : " + nama.toUpperCase()); break;
		
		default : System.out.println("Maaf anda salah input ! "); break;
		}
	}

}
