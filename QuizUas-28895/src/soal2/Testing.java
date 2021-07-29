package soal2;

public abstract class Testing {
	public Testing() {
		System.out.println("Tes motor ready!");
	}
	
	abstract void gas();
	
	void gantiGigi() {
		System.out.println("Mengganti gigi motor sukses!");
	}
	
	void honda() {
		System.out.println("Motor honda siap di testing.");
	}
	
	void ninja() {
		System.out.println("Motor ninja tidak di testing, mahal.");
	}
}
