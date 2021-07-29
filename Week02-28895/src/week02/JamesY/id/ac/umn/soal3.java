package week02.JamesY.id.ac.umn;

import java.util.Scanner;

public class soal3 {

	public static void main(String[] args) {
		int inputKecil;
		int inputBesar;
		int sementara;
		int prima = 1;
		int hasil = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukan nilai terkecil : ");
		inputKecil = scanner.nextInt();
		System.out.println("Masukan nilai terbesar : ");
		inputBesar = scanner.nextInt();
		
		for(int temp = inputKecil; temp <= inputBesar; temp++) {
			prima = 1;
			for(int pembagi = 2; pembagi < temp; pembagi++) {
				sementara = temp % pembagi;
				//System.out.println(sementara);
				if(sementara == 0) {
					prima = 0;
					break;
				}
			}
			if(prima == 1) {
				hasil = hasil + temp;
				//System.out.println(hasil);
			}
		}
		
		System.out.println("Jumlah dari semua nilai prima dari " + inputKecil + " sampai " + inputBesar + " adalah " + hasil);
	}

}
