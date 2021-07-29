package umn.ac.id.JamesYoel;

public class MediaPromosi {
	private String nama;
	private int harga;
	
	public MediaPromosi(){
		
	}
	
	public MediaPromosi(String nama, int harga){
		this.nama = nama;
		this.harga = harga;
	}
	
	public String getNama() {
		return nama;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setHarga(int harga) {
		this.harga = harga;
	}
}
