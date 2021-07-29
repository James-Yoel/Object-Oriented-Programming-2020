package soal2;

public class Polymorphism extends PolymorphismTest{
	Polymorphism(){
		
	}
	//Overriding
	public int getAngka() {
		return angka + 2;
	}
	//Overloading
	public int getAngka2(int angka3) {
		return angka2 + angka3;
	}
}
