package umn.ac.id.JamesYoel;

public class Baliho extends MediaPromosi{
	private int luas;
	private String letak;
	
	public Baliho() {
		
	}
	
	public Baliho(String nama, int luas, String letak) {
		this.setNama(nama);
		this.luas = luas;
		this.letak = letak;
	}
	
	public int getLuas() {
		return luas;
	}
	
	public String getLetak() {
		return letak;
	}
}
