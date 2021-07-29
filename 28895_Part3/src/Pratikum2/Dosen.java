package Pratikum2;

public class Dosen extends Karyawan{
	protected int jumlahBimbingan;
	public Dosen(String nama, int pendapatanTetap, int jumlahBimbingan) {
		super(nama, pendapatanTetap);
		this.jumlahBimbingan = jumlahBimbingan;
	}
	
	public int getPendapatan() {
		return this.pendapatanTetap + (this.jumlahBimbingan * 100000);
	}
}
