package soal3;

public class NullPointer {

	public static void main(String[] args) {
		try {
			String a = null;
			//Terjadi penggunaan suatu fungsi kepada variabel dengan nilai null
			System.out.println(a.charAt(1));
		}
		catch(NullPointerException e) {
			System.out.println("Terjadi penggunaan suatu fungsi pada variabel null!");
		}
	}

}
