package soal6;
import org.javatuples.*; 

public class TupleTest {
	public static void main(String[] args) 
	{ 
		Quartet<String, String, String, String> 
			quartet = new Quartet<String, String, String, String>( 
				"Quartet", "Triplet", "Pair", "Unit"); 
		System.out.println("Quartet: " + quartet); 
		Quintet<String, String, String, String, String> 
			quintet = new Quintet<String, String, String, String, String>( 
				"Quintet 1", 
				//Terkait dengan value pada quartet
				quartet.getValue0(), 
				quartet.getValue1(), 
				quartet.getValue2(), 
				quartet.getValue3()); 
		System.out.println("Quintet: " + quintet); 
	} 
}
