package umn.ac.id.JamesYoel;

public class Celebgram extends MediaPromosi{
	private int umur, tinggiBadan, beratBadan, followers;
	private String akunMedia, bidang;
	
	public Celebgram() {
		
	}
	
	public Celebgram(String nama, int umur, int tinggiBadan, int beratBadan, int followers, String akunMedia, String bidang) {
		this.setNama(nama);
		this.umur = umur;
		this.tinggiBadan = tinggiBadan;
		this.beratBadan = beratBadan;
		this.followers = followers;
		this.akunMedia = akunMedia;
		this.bidang = bidang;
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
	
	public int getFollowers() {
		return followers;
	}
	
	public String getAkunMedia() {
		return akunMedia;
	}
	
	public String getBidang() {
		return bidang;
	}
}
