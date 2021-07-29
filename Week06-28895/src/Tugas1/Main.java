package Tugas1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Voucher> voucher = new ArrayList<Voucher>();
	static ArrayList<Handphone> handphone = new ArrayList<Handphone>();
	static ArrayList<Order> order = new ArrayList<Order>();
	static Scanner in = new Scanner(System.in);
	public static int idV = 0;
	public static int idH = 0;
	public static int idO = 0;
	
	public static void pesanBarang() {
		int pilihan, jumlah = 0, stok = 0, id = 0;
		double harga = 0, pajak = 0, uang, total = 0;
		@SuppressWarnings("unused")
		String nama = null, warna = null;
		boolean retry = false;
		System.out.println("Daftar Barang Toko Voucher & HP\n1. Handphone\n2. Voucher\nPilihan : ");
		pilihan = in.nextInt();
		if(pilihan == 1) {
			if(handphone.size() == 0) {
				System.out.println("Barang tidak tersedia");
				return;
			}
			for(Handphone list: handphone) {
				System.out.println("ID    : " + list.id);
				System.out.println("Nama  : " + list.nama);
				System.out.println("Stock : " + list.stok);
				System.out.println("Harga : " + Math.round(list.harga));
				System.out.println("-------------------------------------------");
			}
			System.out.println("Ketik 0 untuk batal\nPesan Barang (ID) : ");
			pilihan = in.nextInt();
			if(pilihan == 0 ) return;
			for(Handphone list: handphone) {
				if(pilihan == list.id) {
					id = list.id;
					nama = list.nama;
					stok = list.stok;
					harga = list.harga;
					warna = list.getWarna();
				}
				else return;
			}
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
				System.out.println("Masukkan jumlah uang : ");
				uang = in.nextDouble();
				if(uang >= Math.round(total)) {
					retry = true;
					for(Handphone list: handphone) {
						if(id == list.id) {
							list.minusStok(jumlah);
						}
					}
					id = id-1;
					order.add(new Order(idO, handphone.get(id), jumlah, total));
					idO++;
					System.out.println("Berhasil Dipesan");
				}
				else System.out.println("Jumlah uang tidak mencukupi");
			}
		}
		else if(pilihan == 2) {
			if(voucher.size() == 0) {
				System.out.println("Barang tidak tersedia");
				return;
			}
			for(Voucher list: voucher) {
				System.out.println("ID    : " + list.id);
				System.out.println("Nama  : " + list.nama);
				System.out.println("Stock : " + list.stok);
				System.out.println("Harga : " + Math.round(list.harga));
				System.out.println("-------------------------------------------");
			}
			System.out.println("Ketik 0 untuk batal\nPesan Barang (ID) : ");
			pilihan = in.nextInt();
			if(pilihan == 0 ) return;
			for(Voucher list: voucher) {
				if(pilihan == list.id) {
					id = list.id;
					nama = list.nama;
					stok = list.stok;
					harga = list.harga;
					pajak = list.getPajak();
				}
				else return;
			}
			while(retry == false) {
				System.out.println("Masukkan Jumlah : ");
				jumlah = in.nextInt();
				if(jumlah <= stok && jumlah != 0) {
					retry = true;
				}
				else System.out.println("Stok tidak mencukupi");
			}
			retry = false;
			total = harga*jumlah;
			total = total + (total*pajak);
			while(retry == false) {
				System.out.println(jumlah + " @ " + nama + " " + Math.round(harga) + " dengan total harga " + Math.round(total));
				System.out.println("Masukkan jumlah uang : ");
				uang = in.nextDouble();
				if(uang >= Math.round(total)) {
					retry = true;
					for(Voucher list: voucher) {
						if(id == list.id) {
							list.minusStok(jumlah);
						}
					}
					id = id-1;
					order.add(new Order(idO, voucher.get(id), jumlah, total));
					idO++;
					System.out.println("Berhasil Dipesan");
				}
				else System.out.println("Jumlah uang tidak mencukupi");
			}
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
			if(list.getId().contains("OH")) {
				System.out.println("Nama   : "+list.getHandphone().nama);
			}
			else {
				System.out.println("Nama   : "+list.getVoucher().nama);
			}
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
			voucher.add(new Voucher(idV + 1, nama, harga, stok, pajak));
			System.out.println("Voucher telah berhasil diinput");
			idV++;
//			for(Voucher list: voucher) {
//				System.out.println(list.id+"\n"+list.nama+"\n"+list.stok+"\n"+list.harga+"\n"+list.getPajak());
//			}
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
			handphone.add(new Handphone(idH + 1, nama, harga, stok, warna));
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
