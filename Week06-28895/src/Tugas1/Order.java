package Tugas1;

public class Order {
	private String id;
	private Voucher voucher;
	private Handphone handphone;
	private int jumlah;
	private double total;
	
	public Order(int id, Voucher voucher, int jumlah, double total) {
		this.id = String.valueOf(id);
		this.id = "OV".concat(this.id);
		this.voucher = voucher;
		this.jumlah = jumlah;
		this.total = total;
	}
	
	public Order(int id, Handphone handphone, int jumlah, double total) {
		this.id = String.valueOf(id);
		this.id = "OH".concat(this.id);
		this.handphone = handphone;
		this.jumlah = jumlah;
		this.total = total;
	}
	
//	public int getId() {
//		return id;
//	}
	
	public String getId() {
		return id;
	}
	
	public Voucher getVoucher() {
		return voucher;
	}
	
	public Handphone getHandphone() {
		return handphone;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	
	public double getTotal() {
		return total;
	}
}
