package tugas1;

public class Manager extends Karyawan{
	public Manager() {
		
	}
	
	public Manager(String id, String nama) {
		this.id = id;
		this.nama = nama;
		this.gaji = 10000000;
	}
	
	public int getGaji() {
		return gaji;
	}
}
