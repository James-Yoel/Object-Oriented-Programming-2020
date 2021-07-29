import exceptions.ExcessiveFailedLoginException;
import exceptions.InvalidPropertyException;
import exceptions.AuthenticationException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<User> listOfUsers = new ArrayList<User>();
	static Scanner s = new Scanner(System.in);
	static boolean login = false;
	
	public static void initialize() {
		listOfUsers.add(new User("John", "Doe", 'L', "Jl. Merpati No.1 RT 1 RW 1, Banten", "admin", "admin"));
	}
	
	public static boolean checkPassword(String password) {
		int i = 0;
		Character ch;
		boolean digit = false, upper = false;
		if(password.length() >= 6 && password.length() <= 16) {
			for(i = 0; i < password.length(); i++) {
				ch = password.charAt(i);
				if(Character.isDigit(ch)) {
					digit = true;
				}
				else if(Character.isUpperCase(ch)) {
					upper = true;
				}
			}
			if(digit == true && upper == true) {
				return true;
			}
		}
		return false;
	}
	
	public static void handleLogin() throws ExcessiveFailedLoginException, AuthenticationException {
		s.nextLine();
		boolean retry = false;
		while(retry == false) {
			String userName, password, greet;
			System.out.println("Username : ");
			userName = s.nextLine();
			System.out.println("Password : ");
			password = s.nextLine();
			try {
				for(User list: listOfUsers) {
					if(list.login(userName, password) == true) {
						retry = true;
						login = true;
						greet = list.greeting();
						System.out.println(greet);
					}
				}
				if(retry == false) {
					throw new AuthenticationException("Username / Password salah");
				}
			}
			catch(ExcessiveFailedLoginException ex) {
				System.out.println(ex.getMessage());
				retry = true;
				login = true;
			}
			catch(AuthenticationException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	public static void handleSignUp() throws InvalidPropertyException {
		String namaDepan, namaBelakang, alamat, username, password;
		Character gender;
		boolean retry = false;
		while(retry == false) {
			try {
				System.out.println("Nama Depan : ");
				namaDepan = s.next();
				System.out.println("Nama Belakang : ");
				namaBelakang = s.next();
				System.out.println("Jenis Kelamin (L/P) : ");
				gender = s.next().charAt(0);
				if(gender.equals('L') || gender.equals('l') || gender.equals('p') || gender.equals('P')) {
					s.nextLine();
					System.out.println("Alamat : ");
					alamat = s.next();
					System.out.println("Username : ");
					username = s.next();
					if(username.length() > 8 ) {
						System.out.println("Password : ");
						password = s.next();
						if(checkPassword(password) == true) {
							retry = true;
							listOfUsers.add(new User(namaDepan, namaBelakang, Character.toUpperCase(gender), alamat, username, password));
							System.out.println("User berhasil ditambahkan");
						}
						else {
							throw new InvalidPropertyException("Password harus mengandung huruf besar, angka, minimum 6 karakter dan maksimum 16 karakter");
						}
					}
					else {
						throw new InvalidPropertyException("Username harus lebih dari 8 karakter");
					}
				}
				else {
					throw new InvalidPropertyException();
				}
			}
			catch(InvalidPropertyException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public static void main(String[] args) throws ExcessiveFailedLoginException, AuthenticationException, InvalidPropertyException{
		int pilihan;
		initialize();
		do {
			System.out.println("1. Login");
			System.out.println("2. Sign Up");
			System.out.println("Pilihan : ");
			pilihan = s.nextInt();
			switch(pilihan) {
			case 1 : handleLogin(); break;
			case 2 : handleSignUp(); break;
			default: System.out.println("Salah input");
			}
		}
		while(login == false);
	}

}
