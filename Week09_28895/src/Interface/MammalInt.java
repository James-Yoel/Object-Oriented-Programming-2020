package Interface;

public class MammalInt implements Animal{

	public MammalInt() {
		
	}
	
	public void eat() {
		System.out.println("Mammal Eats");
	}
	
	public void travel() {
		System.out.println("Mammal Travel");
	}
	
	public static void main(String[] args) {
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
	}

}
