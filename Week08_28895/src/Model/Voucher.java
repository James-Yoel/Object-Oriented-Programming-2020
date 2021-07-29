package Model;

public class Voucher extends Barang{
	private double pajak;
	public static int total;
	
	public Voucher(String id, String nama, double harga, int stok, double pajak) {
		super(id, nama, harga, stok);
		this.pajak = pajak;
	}
	
	public double getPajak() {
		return pajak;
	}
	
	public double hargaJual() {
		return harga+(harga*pajak);
	}
}
