package umn.ac.id.JamesYoel;

public class Aktor extends MediaPromosi{
	private int umur, tinggiBadan, beratBadan, fans;
	private String fanClub;
	
	public Aktor() {
		
	}
	
	public Aktor(String nama, int umur, int tinggiBadan, int beratBadan, int fans, String fanClub) {
		this.setNama(nama);
		this.umur = umur;
		this.tinggiBadan = tinggiBadan;
		this.beratBadan = beratBadan;
		this.fans = fans;
		this.fanClub = fanClub;
	}
	
	public int getUmur() {
		return umur;
	}
	
	public int getTinggiBadan() {
		return tinggiBadan;
	}
	
	public int getBeratBadan() {
		return beratBadan;
	}
	
	public int getFans() {
		return fans;
	}
	
	public String getFanClub() {
		return fanClub;
	}
	
}
