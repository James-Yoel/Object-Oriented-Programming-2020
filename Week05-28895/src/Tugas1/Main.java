package Tugas1;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	static Scanner s = new Scanner(System.in);
	
	public static void lingkaran() {
		double jariJari;
		String color = "Biru";
		System.out.println("Masukkan jari-jari : ");
		jariJari = s.nextDouble();
		Circle circle = new Circle(jariJari, color);
		System.out.println("----------Lingkaran----------");
		System.out.println("Warna              : "+circle.getColor());
		System.out.println("Jari-jari          : "+circle.getRadius());
		System.out.println("Keliling Lingkaran : "+circle.getPerimeter());
		System.out.println("Luas Lingkaran     : "+circle.getArea());
	}
	
	public static void persegi() {
		int sisi;
		String color = "Merah";
		System.out.println("Masukkan panjang sisi : ");
		sisi = s.nextInt();
		Square square = new Square(sisi, color);
		System.out.println("----------Persegi----------");
		System.out.println("Warna            : "+square.getColor());
		System.out.println("Panjang Sisi     : "+square.getSide());
		System.out.println("Keliling Persegi : "+square.getArea());
		System.out.println("Luas Persegi     : "+square.getWide());
	}

	public static void persegiPanjang() {
		int panjang, lebar;
		String color = "Ungu";
		System.out.println("Masukkan panjang : ");
		panjang = s.nextInt();
		System.out.println("Masukkan lebar : ");
		lebar = s.nextInt();
		Rectangle rectangle = new Rectangle(panjang, lebar, color);
		System.out.println("----------Persegi Panjang----------");
		System.out.println("Warna                    : "+rectangle.getColor());
		System.out.println("Panjang & Lebar          : "+rectangle.getLength()+" & "+rectangle.getWidth());
		System.out.println("Keliling Persegi Panjang : "+rectangle.getArea());
		System.out.println("Luas Persegi Panjang     : "+rectangle.getWide());
	}
	
	public static void segitiga() {
		int alas, tinggi;
		String color = "Hitam";
		System.out.println("Masukkan alas : ");
		alas = s.nextInt();
		System.out.println("Masukkan tinggi : ");
		tinggi = s.nextInt();
		Triangle triangle = new Triangle(alas, tinggi, color);
		System.out.println("----------Segitiga Siku-Siku----------");
		System.out.println("Warna             : "+triangle.getColor());
		System.out.println("Alas & Tinggi     : "+triangle.getBase()+" & "+triangle.getHeight());
		System.out.println("Keliling Segitiga : "+triangle.getArea());
		System.out.println("Luas Segitiga     : "+triangle.getWide());
	}
	
	
	public static void main(String[] args) {
		int pilihan = 0;
		
		while(pilihan != 5) {
			System.out.println("-------Program Menghitung Bangun Ruang-------\n1. Lingkaran\n2. Persegi\n3. Persegi Panjang\n4. Segitiga\n5. Keluar\nPilihan : ");
			pilihan = s.nextInt();
		
			switch(pilihan) {
			case 1 : lingkaran(); System.out.println("\n"); break;
			case 2 : persegi(); System.out.println("\n"); break;
			case 3 : persegiPanjang(); System.out.println("\n"); break;
			case 4 : segitiga(); break;
			case 5 : break;
			default : System.out.println("Input tidak valid\n");
			}
		}
		
		System.out.println("Keluar program...");
	}
}
