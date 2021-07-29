package umn.ac.id.JamesYoel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static ArrayList<MediaPromosi> mediaPromosi = new ArrayList<MediaPromosi>();
	public static ArrayList<Order> order = new ArrayList<Order>();
	static Scanner in = new Scanner(System.in);
	
	public static void arrayListSeeding() {
		mediaPromosi.add(new Aktor("Chris Evans", 30, 170, 60, 100000, "Captain America Lovers"));
		mediaPromosi.add(new Aktor("Robert Downey Jr", 31, 171, 61, 120000, "Ironman Lovers"));
		mediaPromosi.add(new Aktor("Chris Hemsworth", 32, 172, 62, 140000, "Thor Lovers"));
		mediaPromosi.add(new Celebgram("Awkarin", 25, 165, 45, 100000, "Instagram", "Furnitur"));
		mediaPromosi.add(new Celebgram("Anya Geraldine", 26, 166, 46, 120000, "Twitter", "Makanan"));
		mediaPromosi.add(new Celebgram("Devina Aurel", 27, 167, 47, 140000, "Youtube", "Tanaman"));
		mediaPromosi.add(new Baliho("Baliho Jakarta Pusat", 6, "Jakarta Pusat"));
		mediaPromosi.add(new Baliho("Baliho Jakarta Barat", 8, "Jakarta Barat"));
		mediaPromosi.add(new Baliho("Baliho Jakarta Utara", 9, "Jakarta Utara"));
		mediaPromosi.add(new Majalah("Home Decor", 15, "Halaman 2", "Furnitur"));
		mediaPromosi.add(new Majalah("Sedap", 18, "Halaman 3", "Makanan"));
		mediaPromosi.add(new Majalah("Otomotif", 21, "Halaman 4", "Tanaman"));
	}
	
	public static void penambahanMedia() {
		int media = 0, kategori = 0, umur = 0, tinggi = 0, berat = 0, followers = 0, luas = 0, check = 0;
		String nama = null, medsos = null, letak = null, kategoriString = null;
		boolean retry = false;
		while(retry == false) {
			System.out.println("================================");
			System.out.println("     Wemen Marketing Agent");
			System.out.println("================================");
			System.out.println("1. Celebgram");
			System.out.println("2. Majalah");
			System.out.println("================================");
			System.out.println("Pilih Media (1-2) : ");
			try {
				media = in.nextInt();
				if(media > 2 || media < 1) {
					System.out.println("Maaf anda salah input...");
				}
				else {
					retry = true;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Tolong input menggunakan angka!");
			}
			in.nextLine();
		}
		retry = false;
		while(retry == false) {
			System.out.println("================================");
			System.out.println("1. Furnitur");
			System.out.println("2. Makanan");
			System.out.println("3. Tanaman");
			System.out.println("4. Otomotif");
			System.out.println("5. Musik");
			System.out.println("================================");
			System.out.println("Pilih Kategori (1-5) : ");
			try {
				kategori = in.nextInt();
				if(kategori > 5 || kategori < 1) {
					System.out.println("Maaf anda salah input...");
				}
				else {
					switch(kategori) {
					case 1: kategoriString = "Furnitur"; break;
					case 2: kategoriString = "Makanan"; break;
					case 3: kategoriString = "Tanaman"; break;
					case 4: kategoriString = "Otomotif"; break;
					case 5: kategoriString = "Musik"; break;
					}
					retry = true;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Tolong input menggunakan angka!");
			}
			in.nextLine();
		}
		retry = false;
		if(media == 1) {
			while(retry == false) {
				try {
					check = 0;
					System.out.println("Masukkan nama : ");
					nama = in.nextLine();
					System.out.println("Masukkan umur : ");
					umur = in.nextInt();
					System.out.println("Masukkan tinggi badan : ");
					tinggi = in.nextInt();
					System.out.println("Masukkan berat badan : ");
					berat = in.nextInt();
					System.out.println("Masukkan jumlah followers : ");
					followers = in.nextInt();
					System.out.println("Masukkan media sosial yang digunakan : ");
					in.nextLine();
					medsos = in.nextLine();
				}
				catch(InputMismatchException e) {
					System.out.println("Tolong input dengan sesuai!");
					check = 1;
					in.nextLine();
				}
				if(check == 0) {
					retry = true;
				}
			}
			mediaPromosi.add(new Celebgram(nama, umur, tinggi, berat, followers, medsos, kategoriString));
		}
		else if(media == 2) {
			while(retry == false) {
				try {
					check = 0;
					System.out.println("Masukkan nama : ");
					nama = in.nextLine();
					System.out.println("Masukkan luas : ");
					luas = in.nextInt();
					System.out.println("Masukkan letak halaman promosi : ");
					in.nextLine();
					letak = in.nextLine();
				}
				catch(InputMismatchException e) {
					System.out.println("Tolong input dengan sesuai!");
					check = 1;
					in.nextLine();
				}
				if(check == 0) {
					retry = true;
				}
			}
			mediaPromosi.add(new Majalah(nama, luas, letak, kategoriString));
		}
		System.out.println("Media baru telah dimasukkan");
		System.out.println("--------------------------------");
	}
	
	public static boolean isValidFormat(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            System.out.println("Tolong dengan format yang benar!");
        }
        return date != null;
    }
	
	public static void penyewaanMedia() {
		int kategori = 0, hari = 0, i = 0, harga = 0, media = 0, bayar = 0;
		String kategoriString = null, tanggal = null, bidang = null;
		boolean retry = false;
		MediaPromosi mediaPilih = null;
		while(retry == false) {
			System.out.println("================================");
			System.out.println("     Wemen Marketing Agent");
			System.out.println("================================");
			System.out.println("1. Furnitur");
			System.out.println("2. Makanan");
			System.out.println("3. Tanaman");
			System.out.println("4. Otomotif");
			System.out.println("5. Musik");
			System.out.println("================================");
			System.out.println("Pilih Kategori (1-5) : ");
			try {
				kategori = in.nextInt();
				if(kategori > 5 || kategori < 1) {
					System.out.println("Maaf anda salah input...");
				}
				else {
					switch(kategori) {
					case 1: kategoriString = "Furnitur"; break;
					case 2: kategoriString = "Makanan"; break;
					case 3: kategoriString = "Tanaman"; break;
					case 4: kategoriString = "Otomotif"; break;
					case 5: kategoriString = "Musik"; break;
					}
					retry = true;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Tolong input menggunakan angka!");
			}
			in.nextLine();
		}
		retry = false;
		while(retry == false) {
			System.out.println("Tanggal mulai (DDMMYYYY) : ");
			tanggal = in.nextLine();
			if(tanggal.length() == 8) {
				if(isValidFormat("ddMMyyyy", tanggal)) {
					retry = true;
				}
			}
			else {
				System.out.println("Tolong input dengan format yang benar!");
			}
		}
		retry = false;
		while(retry == false) {
			System.out.println("Banyak hari penyewaan : ");
			try {
				hari = in.nextInt();
				if(hari < 1) {
					System.out.println("Tolong masukkan jumlah hari yang benar");
				}
				else {
					retry = true;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Tolong input dengan angka!");
			}
			in.nextLine();
		}
		for(MediaPromosi list: mediaPromosi) {
			i++;
			System.out.println("================================");
			System.out.println("No               : "+i);
			if(list instanceof Aktor) {
				System.out.println("Media            : Aktor");
				System.out.println("Nama             : "+list.getNama());
				System.out.println("Umur             : "+((Aktor)list).getUmur());
				System.out.println("Tinggi Badan     : "+((Aktor)list).getTinggiBadan());
				System.out.println("Berat Badan      : "+((Aktor)list).getBeratBadan());
				System.out.println("Jumlah Fans      : "+((Aktor)list).getFans());
				System.out.println("Nama Fansclub    : "+((Aktor)list).getFanClub());
				harga = (2000 * ((Aktor)list).getFans()) * hari;
				list.setHarga(harga);
				System.out.println("Harga            : "+harga);
			}
			else if(list instanceof Celebgram) {
				System.out.println("Media            : Celebgram");
				System.out.println("Nama             : "+list.getNama());
				System.out.println("Umur             : "+((Celebgram)list).getUmur());
				System.out.println("Tinggi Badan     : "+((Celebgram)list).getTinggiBadan());
				System.out.println("Berat Badan      : "+((Celebgram)list).getBeratBadan());
				System.out.println("Jumlah Followers : "+((Celebgram)list).getFollowers());
				System.out.println("Social Media     : "+((Celebgram)list).getAkunMedia());
				bidang = ((Celebgram)list).getBidang();
				System.out.println("Bidang           : "+bidang);
				if(bidang.equals(kategoriString)) {
					harga = ((1000 * ((Celebgram)list).getFollowers()) * hari) + (500000 * hari);
				}
				else {
					harga = (1000 * ((Celebgram)list).getFollowers()) * hari;
				}
				list.setHarga(harga);
				System.out.println("Harga            : "+harga);
			}
			else if(list instanceof Majalah) {
				System.out.println("Media            : Majalah");
				System.out.println("Nama             : "+list.getNama());
				System.out.println("Luas             : "+((Majalah)list).getLuas());
				System.out.println("Letak            : "+((Majalah)list).getLetak());
				bidang = ((Majalah)list).getBidang();
				System.out.println("Bidang           : "+bidang);
				if(bidang.equals(kategoriString)) {
					harga = ((50000 * ((Majalah)list).getLuas()) * hari) + (200000 * hari);
				}
				else {
					harga = (50000 * ((Majalah)list).getLuas()) * hari;
				}
				list.setHarga(harga);
				System.out.println("Harga            : "+harga);
			}
			else if(list instanceof Baliho) {
				System.out.println("Media            : Baliho");
				System.out.println("Nama             : "+list.getNama());
				System.out.println("Luas             : "+((Baliho)list).getLuas());
				System.out.println("Letak            : "+((Baliho)list).getLetak());
				harga = (3000000 * ((Baliho)list).getLuas()) * hari;
				list.setHarga(harga);
				System.out.println("Harga            : "+harga);
			}
		}
		retry = false;
		System.out.println("================================");
		while(retry == false) {
			System.out.println("Masukkan nomor media : ");
			try {
				media = in.nextInt();
				if(media > i || media < 1) {
					System.out.println("Maaf anda salah input...");
				}
				else {
					mediaPilih = mediaPromosi.get(media - 1);
					retry = true;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Tolong input dengan angka!");
			}
			in.nextLine();
		}
		retry = false;
		while(retry == false) {
			System.out.println("Masukkan uang untuk pembayaran : ");
			try {
				bayar = in.nextInt();
				if(bayar < mediaPilih.getHarga() ) {
					System.out.println("Uang tidak mencukupi.");
				}
				else {
					order.add(new Order(mediaPilih, kategoriString, tanggal, hari));
					retry = true;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Tolong input dengan sesuai!");
			}
			in.nextLine();
		}
		System.out.println("Pemesanan anda sukses.");
		
	}
	
	public static void checkEmploymentRental() {
		int i = 0, pilihan = 0, batal = 0;
		String tanggalTest = "03062020";
		boolean retry = false;
		System.out.println("================================");
		System.out.println("     Wemen Marketing Agent");
		if(order.size() <= 0) {
			System.out.println("================================");
			System.out.println("List Rental masih kosong !");
			return;
		}
		for(Order list: order) {
			System.out.println("================================");
			i++;
			System.out.println("No             : "+i);
			if(list.getMediaPromosi() instanceof Aktor) {
				System.out.println("Media           : Aktor");
			}
			else if(list.getMediaPromosi() instanceof Celebgram) {
				System.out.println("Media           : Celebgram");
			}
			else if(list.getMediaPromosi() instanceof Majalah) {
				System.out.println("Media           : Majalah");
			}
			else if(list.getMediaPromosi() instanceof Baliho) {
				System.out.println("Media           : Baliho");
			}
			System.out.println("Nama            : "+list.getMediaPromosi().getNama());
			System.out.println("Tanggal         : "+list.getTanggal());
			System.out.println("Durasi Kontrak  : "+list.getJangkaWaktu());
			System.out.println("Harga           : "+list.getMediaPromosi().getHarga());
		}
		System.out.println("1. Batalkan Order");
		System.out.println("2. Kembali ke menu utama");
		System.out.println("================================");
		while(retry == false) {
			System.out.println("Pilih menu (1-2) : ");
			try {
				pilihan = in.nextInt();
				if(pilihan == 1) {
					retry = true;
				}
				else if(pilihan == 2) {
					retry = true;
					return;
				}
				else {
					System.out.println("Maaf anda salah input...");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Tolong input dengan angka!");
			}
			in.nextLine();
		}
		retry = false;
		if(pilihan == 1) {
			while(retry == false) {
				System.out.println("Masukkan nomor yang ingin dibatalkan : ");
				try {
					batal = in.nextInt();
					if(batal > i || batal < 1) {
						System.out.println("Maaf anda salah input...");
					}
					else {
						Order checkOrder = order.get(batal - 1);
						if(checkOrder.getTanggal().equals(tanggalTest)) {
							System.out.println("Pesanan ini tidak bisa dibatalkan.");
						}
						else {
							order.remove(batal - 1);
							System.out.println("Pesanan berhasil dibatalkan.");
						}
						retry = true;
					}
				}
				catch(InputMismatchException e) {
					System.out.println("Tolong input dengan angka!");
				}
			}
		}
	}
	
	public static void credits() {
		System.out.println("================================");
		System.out.println("     Wemen Marketing Agent");
		System.out.println("================================");
		System.out.println(" Name : James Yoel");
		System.out.println(" NIM  : 00000028895");
		System.out.println("================================");
		System.out.println("Tekan apapun untuk melanjutkan.");
		in.nextLine();
	}

	public static void main(String[] args) {
		int pilihan = 0;
		arrayListSeeding();
		for(;pilihan != 5;) {
			System.out.println("================================");
			System.out.println("     Wemen Marketing Agent");
			System.out.println("================================");
			System.out.println("1. Penambahan Media");
			System.out.println("2. Penyewaan Media");
			System.out.println("3. Check Employment / Rental");
			System.out.println("4. Credits");
			System.out.println("5. Exit");
			System.out.println("================================");
			System.out.println("Pilih Menu (1-5) : ");
			try {
				pilihan = in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Tolong input menggunakan angka!");
			}
			in.nextLine();
			switch(pilihan) {
			case 1: penambahanMedia(); break;
			case 2: penyewaanMedia(); break;
			case 3: checkEmploymentRental(); break;
			case 4: credits(); break;
			case 5: break;
			default: System.out.println("Maaf anda salah input...");
			}
		}
		System.out.println("Terima Kasih!");
		System.exit(0);
	}

}
