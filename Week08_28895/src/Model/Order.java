package Model;

public class Order {
	private String id;
	private Barang barang;
	private int jumlah;
	private double total;
	
	public Order(String id,Barang barang, int jumlah, double total) {
		this.id = id;
		this.barang = barang;
		this.jumlah = jumlah;
		this.total = total;
	}
	
	public String getId() {
		return id;
	}
	
	public Barang getBarang() {
		return barang;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	
	public double getTotal() {
		return total;
	}
}
