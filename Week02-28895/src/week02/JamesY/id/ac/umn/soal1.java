package week02.JamesY.id.ac.umn;

import java.util.Scanner;
public class soal1 {

	public static void main(String[] args) {
		int input;
		String bulan = null;
		int hari = 0;
		@SuppressWarnings({ "resource" })
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukan bulan(1-12) : ");
		input = scanner.nextInt();
		
		switch(input) {
		case 1: bulan = "Januari"; hari = 31; break;
		case 2: bulan = "Februari"; hari = 28; break;
		case 3: bulan = "Maret"; hari = 31; break;
		case 4: bulan = "April"; hari = 30; break;
		case 5: bulan = "Mei"; hari = 31; break;
		case 6: bulan = "Juni"; hari = 30; break;
		case 7: bulan = "Juli"; hari = 31; break;
		case 8: bulan = "Agustus"; hari = 31; break;
		case 9: bulan = "September"; hari = 30; break;
		case 10: bulan = "October"; hari = 31; break;
		case 11: bulan = "November"; hari = 30; break;
		case 12: bulan = "Desember"; hari = 31; break;
		}
		
		if(input < 1 || input > 12) {
			System.out.println("Maaf anda salah input !");
		}
		else {
			System.out.println("Bulan " + bulan + " memiliki " + hari + " hari");
		}
	}

}
