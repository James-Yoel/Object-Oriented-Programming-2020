package Pratikum2;

public class Karyawan {
	protected String nama;
	protected int pendapatanTetap;
	public Karyawan(String nama, int pendapatanTetap) {
		this.nama = nama;
		this.pendapatanTetap = pendapatanTetap;
	}
	public String getNama() {
		return this.nama;
	}
	public int getPendapatan() {
		return this.pendapatanTetap;
	}
}
