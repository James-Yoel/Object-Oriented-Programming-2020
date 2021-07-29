package Tugas1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static int a = 0;
	
	static Barang[] barang = {
		new Barang(1, 120, 2000, "Pulpen Easy Gel 0.5mm"),
		new Barang(2, 30, 5000, "Penggaris 30cm"),
		new Barang(3, 30, 7000, "Tipe-x Roller"),
		new Barang(4, 50, 5000, "Pensil Mekanik"),
		new Barang(5, 100, 6000, "Buku Tulis")
	};
	
	static ArrayList<Order> order = new ArrayList<Order>();
	
//	static Order[] order = new Order[100];

	
	public static void pesanBarang() {
		int pilihan, stock = 0, jumlah = 0, harga = 0, total = 0, id = 0;
		String nama = null;
		boolean retry = false;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Daftar Barang Toko Multiguna");
		for(Barang item : barang) {
			System.out.println("ID    : "+item.getId());
			System.out.println("Nama  : "+item.getNama());
			System.out.println("Stock : "+item.getStock());
			System.out.println("Harga : "+item.getHarga());
			System.out.println("--------------------------------------\n");
		}
		System.out.println("Ketik 0 untuk batal");
		while(retry == false) {
			System.out.println("Pesan Barang (ID) : ");
			pilihan = in.nextInt();
			
			if(pilihan == 0) return;
			else {
				for(Barang item : barang) {
					if(item.getId()==pilihan) {
						retry = true;
						stock = item.getStock();
						nama = item.getNama();
						harga = item.getHarga();
						id = item.getId();
						//System.out.println(stock);
					}
				}
			}
		}
		
		retry = false;
		while(retry == false) {
			System.out.println("Masukkan Jumlah : ");
			pilihan = in.nextInt();
			if(pilihan <= stock && pilihan != 0) {
				retry = true;
				jumlah = pilihan;
				//System.out.println(jumlah);
			}
		}
		
		total = harga * jumlah;
		retry = false;
		System.out.println(jumlah+" @ "+nama+" dengan total harga "+total);
		while(retry == false) {
			System.out.println("Masukkan jumlah uang : ");
			pilihan = in.nextInt();
			if(pilihan < total) {
				System.out.println("Jumlah uang tidak mencukupi");
			}else {
				for(Barang item: barang) {
					if(id == item.getId()) {
						item.minusStock(jumlah);
					}
				}
				retry = true;
				System.out.println("Berhasil dipesan");
//				order[a] = new Order(jumlah, total, nama);
//				a++;
				id = id-1;
				order.add(new Order(a+1, barang[id], jumlah, total));
				a++;
			}
		} 
	}
	
	public static void lihatPesanan() {
		int i = 1;
		System.out.println("Daftar Pesanan Toko Multiguna");
//		for(Order list : order) {
//			//System.out.println(list.getNama());
//			if(list.getNama()!=null) {
//				System.out.println("ID     : "+i);
//				System.out.println("Nama   : "+list.getNama());
//				System.out.println("Jumlah : "+list.getJumlah());
//				System.out.println("Total  : "+list.getTotal());
//				System.out.println("--------------------------------------\n");
//				i++;	
//			}
//			else {
//				System.out.println("OOF");
//			}
//		}
//		for(int i = 0; i<Order list : order.length; i++) {
//			System.out.println("ID     : "+i+1);
//			System.out.println("Nama   : "+order[i]);
//		}
		for(Order list : order) {
			System.out.println("ID      : "+list.getId());
			System.out.println("Nama    : "+list.getBarang().getNama());
			System.out.println("Jumlah  : "+list.getJumlah());
			System.out.println("Total   : "+list.getTotal());
			System.out.println("--------------------------------------\n");
		}
	}
	
	public static void main(String[] args) {
		int pilihan;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		for(;;) {
			System.out.println("------------Menu Toko Multiguna------------\n1. Pesan Barang\n2. Lihat Pesanan\nPilihan : ");
			pilihan = in.nextInt();
			switch(pilihan) {
			case 1: pesanBarang(); break;
			case 2: lihatPesanan(); break;
			default:
			}
		}
	}

}
