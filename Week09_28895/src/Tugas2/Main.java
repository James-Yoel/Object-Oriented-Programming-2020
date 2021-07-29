package Tugas2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Item> listOfItems = new ArrayList<Item>();
	static ArrayList<Payment> listOfPayment = new ArrayList<Payment>();
	static Scanner s = new Scanner(System.in);
	static int idP = 0;
	
	public static void seedData() {
		listOfItems.add(new Item("Kulkas", "Electronic", 4800000));
		listOfItems.add(new Item("TV", "Electronic", 1280000));
		listOfItems.add(new Item("Laptop", "Computer", 6000000));
		listOfItems.add(new Item("PC", "Computer", 12000000));
	}
	
	public static void pesanBarang() {
		int i = 0, pilihan = 0, uang = 0, cicil = 0;
		String bayar = null;
		boolean retry = false;
		Item itemConfirm;
		System.out.println("----Daftar Barang----");
		i = 0;
		for(Item list: listOfItems) {
			System.out.println("No    : "+(i+1));
			System.out.println("Nama  : "+list.getName());
			System.out.println("Tipe  : "+list.getType());
			System.out.println("Harga : "+list.getPrice());
			System.out.println("---------------------------------");
			i++;
		}
		while(retry == false) {
			System.out.println("Pilih : ");
			pilihan = s.nextInt();
			if(pilihan <= 0 || pilihan > i) {
				System.out.println("Salah Input");
			}
			else retry = true;
		}
		itemConfirm = listOfItems.get(pilihan - 1);
		System.out.println("Nama  : "+itemConfirm.getName());
		System.out.println("Tipe  : "+itemConfirm.getType());
		System.out.println("Harga : "+itemConfirm.getPrice());
		System.out.println("----Tipe Pembayaran----");
		System.out.println("1. Cash");
		System.out.println("2. Credit");
		retry = false;
		while(retry == false) {
			System.out.println("Pilih : ");
			pilihan = s.nextInt();
			if(pilihan == 1 || pilihan == 2) {
				retry = true;
			}
			else System.out.println("Salah Input");
		}
		if(pilihan == 1) {
			retry = false;
			while(retry == false) {
				System.out.println("Bayar (Y/N): ");
				bayar = s.next();
				if(bayar.toUpperCase().equals("Y") || bayar.toUpperCase().equals("N")) {
					retry = true;
				}
				else System.out.println("Salah Input");
			}
			listOfPayment.add(new Cash(itemConfirm));
			if(bayar.toUpperCase().equals("Y")) {
				System.out.println("Harga Pembayaran : "+(listOfPayment.get(idP).pay()));
				retry = false;
				while(retry == false) {
					System.out.println("Bayar : ");
					uang = s.nextInt();
					if(uang >= itemConfirm.getPrice()) {
						retry = true;
						System.out.println("Transaksi telah dibayar lunas");
					}
					else System.out.println("Jumlah uang tidak mencukupi");
				}
			}
			else {
				System.out.println("Transaksi telah disimpan");
			}
			idP++;
		}
		else {
			retry = false;
			while(retry == false) {
				System.out.println("Lama Cicilan (3/6/9/12): ");
				cicil = s.nextInt();
				if(cicil == 3 || cicil == 6 || cicil == 9 || cicil == 12) {
					retry = true;
				}
				else System.out.println("Salah input");
			}
			listOfPayment.add(new Credit(itemConfirm, cicil));
			retry = false;
			System.out.println("Harga Pembayaran : "+listOfPayment.get(idP).pay());
			while(retry == false) {
				System.out.println("Bayar : ");
				uang = s.nextInt();
				if(uang != listOfPayment.get(idP).pay()) {
					System.out.println("Jumlah uang tidak sesuai");
				}
				else {
					retry = true;
					((Credit)listOfPayment.get(idP)).installment = ((Credit)listOfPayment.get(idP)).installment+uang;
					System.out.println("Transaksi telah dibayar");
				}
			}
		}
	}
	
	public static void lihatPesanan() {
		int i = 0, pilihan = 0, uang = 0, checkPaid = 0;
		boolean retry = false;
		if(listOfPayment.size() == 0) {
			System.out.println("Pesanan masih kosong");
			return;
		}
		for(Payment list: listOfPayment) {
			System.out.println("No              : "+(i+1));
			System.out.println("Nama            : "+list.getItemName());
			System.out.println("Tipe            : "+list.getItem().getType());
			System.out.println("Status          : "+list.getStatus());
			System.out.println("Sisa Pembayaran : "+list.getRemainingAmount());
			System.out.println("-------------------------------");
			i++;
		}
		while(retry == false) {
			System.out.println("Pilih No Transaksi : ");
			pilihan = s.nextInt();
			if(pilihan <= 0 || pilihan > i) {
				System.out.println("Salah Input");
			}
			else retry = true;
		}
		if(listOfPayment.get(pilihan-1).getClassName().equals("CASH")) {
			System.out.println("Nama             : "+listOfPayment.get(pilihan-1).getItemName());
			System.out.println("Tipe             : "+listOfPayment.get(pilihan-1).getItem().getType());
			System.out.println("Status           : "+listOfPayment.get(pilihan-1).getStatus());
			System.out.println("Sisa Pembayaran  : "+listOfPayment.get(pilihan-1).getRemainingAmount());
			if(listOfPayment.get(pilihan-1).getPaidOff() == false) {
				retry = false;
				System.out.println("Harga Pembayaran : "+listOfPayment.get(pilihan-1).pay());
				while(retry == false) {
					System.out.println("Bayar : ");
					uang = s.nextInt();
					if(uang >= listOfPayment.get(pilihan-1).getItem().getPrice()) {
						retry = true;
						System.out.println("Transaksi telah dibayar lunas");
					}
					else System.out.println("Jumlah uang tidak mencukupi");
				}
			}
			else {
				System.out.println("Harga Pembayaran : "+listOfPayment.get(pilihan-1).pay());
				System.out.println("Transaksi telah lunas");
			}
		}
		else {
			System.out.println("Nama             : "+listOfPayment.get(pilihan-1).getItemName());
			System.out.println("Tipe             : "+listOfPayment.get(pilihan-1).getItem().getType());
			System.out.println("Status           : "+listOfPayment.get(pilihan-1).getStatus());
			System.out.println("Sisa Pembayaran  : "+listOfPayment.get(pilihan-1).getRemainingAmount());
			if(listOfPayment.get(pilihan-1).getPaidOff() == false) {
				retry = false;
				System.out.println("Harga Pembayaran : "+listOfPayment.get(pilihan-1).pay());
				while(retry == false) {
					System.out.println("Bayar : ");
					uang = s.nextInt();
					if(uang == listOfPayment.get(pilihan-1).pay()) {
						retry = true;
						((Credit)listOfPayment.get(pilihan-1)).installment = ((Credit)listOfPayment.get(pilihan-1)).installment + uang;
						checkPaid = listOfPayment.get(pilihan-1).pay();
						if(checkPaid == 0) {
							System.out.println("Transaksi telah dibayar lunas");
						}
						else System.out.println("Transaksi telah dibayar");
					}
					else System.out.println("Jumlah uang tidak sesuai");
				}
			}
			else {
				System.out.println("Harga Pembayaran : "+listOfPayment.get(pilihan-1).pay());
				System.out.println("Transaksi telah lunas");
			}
		}
	}

	public static void main(String[] args) {
		int opt = 0;
		seedData();
		do {
			System.out.println("---Program Toko Elektronik---");
			System.out.println("1. Pesan Barang");
			System.out.println("2. Lihat Pesanan");
			System.out.println("0. Keluar");
			System.out.println("Pilihan : ");
			opt = s.nextInt();
			if(opt == 1) {
				pesanBarang();
			}
			else if(opt == 2) {
				lihatPesanan();
			}
			else {
				System.out.println("Salah Input");
			}
		}
		while(opt != 0);
		System.out.println("Terima Kasih");
	}
}
