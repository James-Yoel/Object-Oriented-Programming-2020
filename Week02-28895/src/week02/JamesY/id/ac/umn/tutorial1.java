package week02.JamesY.id.ac.umn;

import java.util.Scanner;
public class tutorial1 {

	public static void main(String[] args) {
		int input;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String[] matkulIF = {
			"Matematika Diskrit",
			"Dasar-dasar pemrograman",
			"Pemrograman Berorientasi Objek"
		};
		
		String[] matkulICE = {
			"Riset Operasi",
			"Jaringan Komputer",
			"Aljabar Linear"
		};
		
		String[] matkulIS = {
			"Sistem Database",
			"Administrasi Database"
		};
		
		System.out.println("Pilih Kategori mata kuliah");
		System.out.println("1. Informatika\n2. Computer Engineering\n3. Information System");
		System.out.println("Pilih : ");
		input = scanner.nextInt();
		
		switch(input) {
		case 1: System.out.println("Daftar mata kuliah IF : "); show(matkulIF); break;
		case 2: System.out.println("Daftar mata kuliah CE : "); show(matkulICE); break;
		case 3: System.out.println("Daftar mara kuliah IS : "); show(matkulIS); break;
		default: System.out.println("Pilihan tidak valid");
		}
	}

	private static void show(String[] matkul) {
		for(String eachMatkul : matkul) {
			System.out.println("- " + eachMatkul);
		}
	}
}
