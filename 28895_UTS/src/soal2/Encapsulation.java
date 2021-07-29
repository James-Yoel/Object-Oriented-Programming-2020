package soal2;

public class Encapsulation {
	public String nama1 ;
	protected String nama2;
	private String nama3;
	
	public Encapsulation(){
		nama1 = "nama1";
		nama2 = "nama2";
		nama3 = "nama3";
	}
	
	public void printNama1() {
		System.out.println(nama1);
	}
	protected void printNama2() {
		System.out.println(nama2);
	}
	private void printNama3() {
		System.out.println(nama3);
	}
}
