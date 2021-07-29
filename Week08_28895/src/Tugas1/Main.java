package Tugas1;

import java.util.ArrayList;
import java.util.Scanner;
//package
import Model.Order;
import Model.Voucher;
import Model.Barang;
import Model.Handphone;

public class Main {
	
	public static ArrayList<Barang> barang = new ArrayList<Barang>();
	public static ArrayList<Order> order = new ArrayList<Order>();
	static Scanner in = new Scanner(System.in);
	public static int idV = 0;
	public static int idH = 0;
	public static int idO = 0;	
	
	
	public static void pesanBarang() {
		int jumlah = 0, stok = 0, i = 0;
		double harga = 0, pajak = 0, uang, total = 0;
		@SuppressWarnings("unused")
		String nama = null, warna = null, id = null;
		boolean retry = false;
		System.out.println("Daftar Barang Toko Voucher & HP");
		if(barang.size() == 0) {
			System.out.println("Barang tidak tersedia");
			return;
		}
		for(Barang list: barang) {
			if(list instanceof Handphone) {
				System.out.println("ID      : "+list.getId());
				//downcasting
				System.out.println("Nama    : "+list.getNama()+" "+((Handphone)list).getWarna());
				System.out.println("Stok    : "+list.getStok());
				System.out.println("Harga   : "+Math.round(list.getHarga()));
				System.out.println("-----------------------------------------");
			}
			else if(list instanceof Voucher) {
				System.out.println("ID      : "+list.getId());
				System.out.println("Nama    : "+list.getNama());
				System.out.println("Nominal : "+Math.round(list.getHarga()));
				System.out.println("Stok    : "+list.getStok());
				//downcasting
				System.out.println("Harga   : "+Math.round(list.getHarga()+(list.getHarga()*(((Voucher)list).getPajak()))));
				System.out.println("-----------------------------------------");
			}
		}
		while(retry == false) {
			System.out.println("Ketik 0 untuk batal\nPesan Barang (ID) : ");
			id = in.next();
			if(id.equals("0")) return;
			for(Barang list: barang) {
				if(id.toUpperCase().equals(list.getId())) {
					retry = true;
					if(list instanceof Handphone) {
						id = list.getId();
						nama = list.getNama();
						stok = list.getStok();
						harga = list.getHarga();
						//downcasting
						warna = ((Handphone)list).getWarna();
					}
					else if(list instanceof Voucher) {
						id = list.getId();
						nama = list.getNama();
						stok = list.getStok();
						harga = list.getHarga();
						//downcasting
						pajak = ((Voucher)list).getPajak();
						harga = harga + (harga*pajak);
					}
				}
			}
			if(retry == false) {
				System.out.println("Barang Tidak Ditemukan");
			}
		}
		retry = false;
		while(retry == false) {
			System.out.println("Masukkan Jumlah : ");
			jumlah = in.nextInt();
			if(jumlah <= stok && jumlah != 0) {
				retry = true;
			}
			else System.out.println("Stok tidak mencukupi");
		}
		total = harga*jumlah;
		retry = false;
		while(retry == false) {
			System.out.println(jumlah + " @ " + nama + " dengan total harga " + Math.round(total));
			System.out.println("Masukkan Jumlah Uang : ");
			uang = in.nextDouble();
			if(uang >= Math.round(total)) {
				retry = true;
				for(Barang list: barang) {
					i = 0;
					if(id.toUpperCase().equals(list.getId())) {
						list.minusStok(jumlah);
					}
					i++;
				}
				order.add(new Order(id.toUpperCase().concat("-")+idO, barang.get(i-1), jumlah, total));
				idO++;
				System.out.println("Berhasil Dipesan");
			}
			else System.out.println("Jumlah uang tidak mencukupi");
		}
	}
	
	public static void lihatPesanan() {
		if(order.size() == 0) {
			System.out.println("Pesanan tidak tersedia");
			return;
		}
		System.out.println("Daftar Pesanan Toko Voucher & HP");
		for(Order list: order) {
			System.out.println("ID     : "+list.getId());
			System.out.println("Nama   : "+list.getBarang().getNama());
			System.out.println("Jumlah : "+list.getJumlah());
			System.out.println("Total  : "+Math.round(list.getTotal()));
			System.out.println("-------------------------------------------");
		}
	}
	
	public static void barangBaru() {
		String pilihan, nama, warna;
		double harga, pajak;
		int stok;
		System.out.println("Voucher / Handphone (V/H): ");
		pilihan = in.next();
		in.nextLine();
		if(pilihan.equals("v") || pilihan.equals("V")) {
			System.out.println("Nama : ");
			nama = in.nextLine();
			System.out.println("Harga : ");
			harga = in.nextDouble();
			System.out.println("Stok : ");
			stok = in.nextInt();
			System.out.println("PPN : ");
			pajak = in.nextDouble();
			//upcasting
			barang.add(new Voucher("V0".concat(String.valueOf(idV + 1)), nama, harga, stok, pajak));
			System.out.println("Voucher telah berhasil diinput");
			idV++;
		}
		else if(pilihan.equals("h") || pilihan.equals("H")) {
			System.out.println("Nama : ");
			nama = in.nextLine();
			System.out.println("Harga : ");
			harga = in.nextDouble();
			System.out.println("Stok : ");
			stok = in.nextInt();
			System.out.println("Warna : ");
			in.nextLine();
			warna = in.nextLine();
			//upcasting
			barang.add(new Handphone("H0".concat(String.valueOf(idH + 1)), nama, harga, stok, warna));
			System.out.println("Handphone telah berhasil diinput");
			idH++;
		}
	}
	
	public static void main(String[] args) { 
		int pilihan;
		for(;;) {
			System.out.println("------------Menu Toko Voucher & HP------------\n1. Pesan Barang\n2. Lihat Pesanan\n3. Barang Baru\nPilihan : ");
			pilihan = in.nextInt();
			switch(pilihan) {
			case 1: pesanBarang(); break;
			case 2: lihatPesanan(); break;
			case 3: barangBaru(); break;
			}
		}
	}

}
