package soal1;

public class RectangleDemo {
	public static void main(String args[]) 
    { 
    // r1 merupakan variabel reference yang memiliki
    // alamat dari object Rectangle sesungguhnya
    Rectangle r1 = new Rectangle();   
    // r2 is variabel reference lainnya 
    // r2 is di inisialisasi menggunakan r1: 
    // r1 dan r2 sama2 mengreferensi objek yang sama  
    // maka tidak mengduplikasi objek yang sama  
    // dan tidak menggunakan memori alokasi tambahan
    Rectangle r2 = r1; 
    r1.length = 10; 
    r2.length = 20; 
    System.out.println("Value of R1's Length : " + r1.length); 
    System.out.println("Value of R2's Length : " + r2.length); 
    } 
}
