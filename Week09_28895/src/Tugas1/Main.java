package Tugas1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Item> listOfItems = new ArrayList<Item>();
	static ArrayList<Payment> listOfPayment = new ArrayList<Payment>();
	static Scanner s = new Scanner(System.in);
	
	public static void seedData() {
		listOfItems.add(new Item("Kulkas", "Electronic", 4800000));
		listOfItems.add(new Item("TV", "Electronic", 1280000));
		listOfItems.add(new Item("Laptop", "Computer", 6000000));
		listOfItems.add(new Item("PC", "Computer", 12000000));
	}
	
	public static void printItem(Item item) {
		System.out.println("Nama  : "+item.getName());
		System.out.println("Tipe  : "+item.getType());
		System.out.println("Harga : "+item.getPrice());
	}

	public static void main(String[] args) {
		int opt = 0, id = 0;
		seedData();
		do {
			System.out.println("---Program Toko Elektronik---");
			System.out.println("1. Pesan Barang");
			System.out.println("2. Lihat Pesanan");
			System.out.println("0. Keluar");
			System.out.println("Pilihan : ");
			opt = s.nextInt();
			if(opt == 1) {
				System.out.println("----Daftar Barang----");
				for(int i = 0; i < listOfItems.size(); i++) {
					System.out.println("No    : "+(i+1));
					printItem(listOfItems.get(i));
					System.out.println("---------------------------------");
				}
				System.out.println("Pilih : ");
			}
			else if(opt == 2) {
				
			}
			else {
				System.out.println("Salah Input");
			}
		}
		while(opt != 0);
	}

}
