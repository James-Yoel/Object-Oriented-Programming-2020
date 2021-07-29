package Pratikum2;

public class StaffAkademik extends Karyawan{
	public StaffAkademik(String nama, int pendapatanTetap) {
		super(nama, pendapatanTetap);
	}
	
	public int getPendapatan(int flatBonus) {
		return this.pendapatanTetap+flatBonus;
	}
}
