package soal1;

public class Garbage {

	public static void main(String[] args) throws InterruptedException {
		new Garbage();
		new Garbage();
		System.gc();
		System.gc();
	}
	protected void finalize() throws Throwable 
    { 
        System.out.println("Garbage collector called"); 
        System.out.println("Object garbage collected : " + this); 
    } 

}
