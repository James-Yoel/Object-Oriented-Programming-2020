package tugas1;

public class Tetap extends Karyawan{
	public Tetap() {
		
	}
	
	public Tetap(String id, String nama) {
		this.id = id;
		this.nama = nama;
		this.gaji = 3000000;
	}
	
	public int getGaji() {
		return gaji;
	}
}
