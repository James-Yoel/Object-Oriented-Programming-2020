package soal1;

//Inheritance
public class Child extends Parent{
	//overwrite
	static int a = 10;
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		printParent();
	}
}
