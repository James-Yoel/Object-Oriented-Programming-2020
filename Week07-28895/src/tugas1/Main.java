package tugas1;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

	static ArrayList<Manager> manager = new ArrayList<Manager>();
	static ArrayList<Tetap> tetap = new ArrayList<Tetap>();
	static ArrayList<Magang> magang = new ArrayList<Magang>();
	static Scanner in = new Scanner(System.in);
	static DecimalFormat Rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
	static DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
	static int idM = 1;
	static int idKT = 1;
	static int idKM = 1;
	
	public static void lihatKaryawan() {
		formatRp.setCurrencySymbol("Rp. ");
	    formatRp.setMonetaryDecimalSeparator(',');
	    formatRp.setGroupingSeparator('.');
		Rp.setDecimalFormatSymbols(formatRp);
		System.out.println("-----Daftar Manajer-----");
		if(manager.size() != 0) {
			for(Manager listM: manager) {
				System.out.println("ID   : " +listM.getId());
				System.out.println("Nama : " +listM.getNama());
				System.out.println("Gaji : " +Rp.format(listM.getGaji()));
				System.out.println("--------------------");
			}
		}
		else {
			System.out.println("Tidak ada");
		}
		System.out.println("-----Daftar Pegawai Tetap-----");
		if(tetap.size() != 0) {
			for(Tetap listKT: tetap) {
				System.out.println("ID   : " +listKT.getId());
				System.out.println("Nama : " +listKT.getNama());
				System.out.println("Gaji : " +Rp.format(listKT.getGaji()));
				System.out.println("--------------------");
			}
		}
		else {
			System.out.println("Tidak ada");
		}
		System.out.println("-----Daftar Pegawai Magang-----");
		if(magang.size() != 0) {
			for(Magang listKM: magang) {
				System.out.println("ID   : " +listKM.getId());
				System.out.println("Nama : " +listKM.getNama());
				System.out.println("Gaji : " +Rp.format(listKM.getGaji()));
				System.out.println("--------------------");
			}
		}
		else {
			System.out.println("Tidak ada");
		}
	}
	
	public static void tambahKaryawan() {
		int pilihan;
		String nama, id;
		System.out.println("-----Tambah Karyawan-----\n1. Manajer\n2. Karyawan Tetap\n3. Karyawan Magang\nPilih : ");
		pilihan = in.nextInt();
		if(pilihan > 3) {
			return;
		}
		in.nextLine();
		System.out.println("Nama : ");
		nama = in.nextLine();
		if(pilihan == 1) {
			id = String.valueOf(idM);
			id = "M".concat(id);
			manager.add(new Manager(id, nama));
			System.out.println("Manajer baru telah ditambahkan");
			idM++;
		}
		else if(pilihan == 2) {
			id = String.valueOf(idKT);
			id = "R".concat(id);
			tetap.add(new Tetap(id, nama));
			System.out.println("Karyawan tetap baru telah ditambahkan");
			idKT++;
		}
		else if(pilihan == 3) {
			id = String.valueOf(idKM);
			id = "I".concat(id);
			magang.add(new Magang(id, nama));
			System.out.println("Karyawan magang baru telah ditambahkan");
		}
	}
	
	public static void main(String[] args) {
		int pilihan = 0;
		for(;pilihan!=3;) {
			System.out.println("-----Program Data Karyawan-----\n1. Lihat Karyawan\n2. Tambah Karyawan\n3. Keluar\nPilih : ");
			pilihan = in.nextInt();
			switch(pilihan) {
			case 1: lihatKaryawan(); break;
			case 2: tambahKaryawan(); break;
			case 3: System.out.println("Terima Kasih.");
			}
		}
		
	}

}
