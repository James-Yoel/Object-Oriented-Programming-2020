package tugas1;

public class Magang extends Karyawan{
	public Magang() {
		
	}
	
	public Magang(String id, String nama) {
		this.id = id;
		this.nama = nama;
		this.gaji = 1500000;
	}
	
	public int getGaji() {
		return gaji;
	}
}
