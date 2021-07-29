package Pratikum1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String nama;
		int nilai;
		System.out.println("Nama: ");
		nama = in.nextLine();
		System.out.println("Nilai: ");
		nilai = in.nextInt();
		System.out.println("Nama: "+nama+"\nNilai: "+nilai);
		if(nilai > 100) {
			System.out.println("Keterangan: Terjadi Kesalahan");
		}
		else if(nilai >= 90) {
			System.out.println("Keterangan: Istimewa\nIndeks: A");
		}
		else if(nilai >=80) {
			System.out.println("Keterangan: Amat Baik\nIndeks: B");
		}
		else if(nilai >= 70) {
			System.out.println("Keterangan: Baik\nIndeks: B");
		}
		else if(nilai >= 60) {
			System.out.println("Keterangan: Cukup\nIndeks: C");
		}
		else if(nilai >= 50) {
			System.out.println("Keterangan: Kurang\nIndeks: D");
		}
		else {
			System.out.println("Keterangan: Sangat Kurang\nIndeks: E");
		}
		if(nilai >= 60) {
			System.out.println("Predikat: LULUS");
		}
		else {
			System.out.println("Predikat: TIDAK LULUS");
		}
	}

}
