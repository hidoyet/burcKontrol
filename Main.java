package burclar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Do�du�unuz ay� yaz�n�z");
		String ay;
		ay=scanner.nextLine();
		
		if(ay.toLowerCase()!="mart"||ay.toLowerCase()!="nisan"||ay.toLowerCase()!="may�s"||ay.toLowerCase()!="haziran"||
				ay.toLowerCase()!="temmuz"||ay.toLowerCase()!="a�ustos"||ay.toLowerCase()!="eyl�l"||ay.toLowerCase()!="ekim"||
				ay.toLowerCase()!="kas�m"||ay.toLowerCase()!="aral�k"||ay.toLowerCase()!="ocak"||ay.toLowerCase()!="�ubat") {
			System.out.println("ge�erli bir ay giriniz");
			
		}
		int gun;
		System.out.println("do�du�unuz g�n� giriniz");
		gun=scanner.nextInt();
		if(gun<=0||gun>31) {
			System.out.println("do�um tarihiniz 1-31 ars�nda olabilir");
		}
		
		
		//ko� burcu
		if(ay.toLowerCase().equals("mart")) {
			if(gun>=21) {
				System.out.println("ko� burcusunuz");
			}			
		}	
		
		if(ay.toLowerCase().equals("nisan")) {
			if(gun<21) {
				System.out.println("ko� burcusunuz");
			}			
		}
		//bo�a burcu
		if(ay.toLowerCase().equals("nisan")) {
			if(gun>=21) {
				System.out.println("bo�a burcusunuz");
			}			
		}		
		if(ay.toLowerCase().equals("may�s")) {
			if(gun<=21) {
				System.out.println("bo�a burcusunuz");
			}			
		}
		//ikizler
		if(ay.toLowerCase().equals("may�s")) {
			if(gun>21) {
				System.out.println("ikizler burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("haziran")) {
			if(gun<=22) {
				System.out.println("ikizler burcusunuz");
			}			
		}
		
		//yenge� burcu
		if(ay.toLowerCase().equals("haziran")) {
			if(gun>22) {
				System.out.println("yenge� burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("temmuz")) {
			if(gun<23) {
				System.out.println("yenge� burcusunuz");
			}			
		}
		
		//aslan burcu
		if(ay.toLowerCase().equals("temmuz")) {
			if(gun>22) {
				System.out.println("aslan burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("a�ustos")) {
			if(gun<23) {
				System.out.println("aslan burcusunuz");
			}			
		}
		
		//ba�ak burcu
		if(ay.toLowerCase().equals("a�ustos")) {
			if(gun>22) {
				System.out.println("ba�ak burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("eyl�l")) {
			if(gun<=23) {
				System.out.println("ba�ak burcusunuz");
			}			
		}
		
		//terazi burcu
		if(ay.toLowerCase().equals("eyl�l")) {
			if(gun>22) {
				System.out.println("terazi burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("ekim")) {
			if(gun<=23) {
				System.out.println("terazi burcusunuz");
			}			
		}
		
		//akrep burcu
		if(ay.toLowerCase().equals("ekim")) {
			if(gun>22) {
				System.out.println("akrep burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("kas�m")) {
			if(gun<22) {
				System.out.println("akrep burcusunuz");
			}			
		}
		
		//yay burcu
		if(ay.toLowerCase().equals("kas�m")) {
			if(gun>21) {
				System.out.println("yay burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("aral�k")) {
			if(gun<22) {
				System.out.println("yay burcusunuz");
			}			
		}
		
		//o�lak burcu
		if(ay.toLowerCase().equals("aral�k")) {
			if(gun>21) {
				System.out.println("o�lak burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("ocak")) {
			if(gun<22) {
				System.out.println("o�lak burcusunuz");
			}			
		}
		
		//kova burcu
		if(ay.toLowerCase().equals("ocak")) {
			if(gun>21) {
				System.out.println("kova burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("�ubat")) {
			if(gun<20) {
				System.out.println("kova burcusunuz");
			}			
		}
		
		//bal�k burcu
		if(ay.toLowerCase().equals("�ubat")) {
			if(gun>19) {
				System.out.println("bal�k burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("mart")) {
			if(gun<21) {
				System.out.println("bal�k burcusunuz");
			}			
		}
		
		
	}

}
