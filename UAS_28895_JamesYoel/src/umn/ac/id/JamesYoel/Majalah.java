package umn.ac.id.JamesYoel;

public class Majalah extends MediaPromosi{
	private int luas;
	private String letak;
	private String bidang;
	
	public Majalah() {
		
	}
	
	public Majalah(String nama, int luas, String letak, String bidang) {
		this.setNama(nama);
		this.luas = luas;
		this.letak = letak;
		this.bidang = bidang;
	}
	
	public int getLuas() {
		return luas;
	}
	
	public String getLetak() {
		return letak;
	}
	
	public String getBidang() {
		return bidang;
	}
}
