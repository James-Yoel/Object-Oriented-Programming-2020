package Tugas1;

public class Order {

	private int id, jumlah, total;
	private Barang barang;
	//public static int total;
	
    public Order(){}
	public Order(int id, Barang barang, int jumlah, int total) {
		this.id = id;
		this.barang = barang;
		this.jumlah = jumlah;
		this.total = total;
	}
	
	public int getId() {
		return id;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	
	public Barang getBarang() {
		return barang;
	}
	
	public int getTotal() {
		return total;
	}
	
//	private int jumlah, total;
//	private String nama;
//	
//	public Order(int jumlah, int total, String nama) {
//		this.jumlah = jumlah;
//		this.total = total;
//		this.nama = nama;
//	}
//	
//	public int getJumlah() {
//		return jumlah;
//	}
//	
//	public int getTotal() {
//		return total;
//	}
//	
//	public String getNama() {
//		return nama;
//	}
//
}
