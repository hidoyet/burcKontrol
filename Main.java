package burclar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Doðduðunuz ayý yazýnýz");
		String ay;
		ay=scanner.nextLine();
		
		if(ay.toLowerCase()!="mart"||ay.toLowerCase()!="nisan"||ay.toLowerCase()!="mayýs"||ay.toLowerCase()!="haziran"||
				ay.toLowerCase()!="temmuz"||ay.toLowerCase()!="aðustos"||ay.toLowerCase()!="eylül"||ay.toLowerCase()!="ekim"||
				ay.toLowerCase()!="kasým"||ay.toLowerCase()!="aralýk"||ay.toLowerCase()!="ocak"||ay.toLowerCase()!="þubat") {
			System.out.println("geçerli bir ay giriniz");
			
		}
		int gun;
		System.out.println("doðduðunuz günü giriniz");
		gun=scanner.nextInt();
		if(gun<=0||gun>31) {
			System.out.println("doðum tarihiniz 1-31 arsýnda olabilir");
		}
		
		
		//koç burcu
		if(ay.toLowerCase().equals("mart")) {
			if(gun>=21) {
				System.out.println("koç burcusunuz");
			}			
		}	
		
		if(ay.toLowerCase().equals("nisan")) {
			if(gun<21) {
				System.out.println("koç burcusunuz");
			}			
		}
		//boða burcu
		if(ay.toLowerCase().equals("nisan")) {
			if(gun>=21) {
				System.out.println("boða burcusunuz");
			}			
		}		
		if(ay.toLowerCase().equals("mayýs")) {
			if(gun<=21) {
				System.out.println("boða burcusunuz");
			}			
		}
		//ikizler
		if(ay.toLowerCase().equals("mayýs")) {
			if(gun>21) {
				System.out.println("ikizler burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("haziran")) {
			if(gun<=22) {
				System.out.println("ikizler burcusunuz");
			}			
		}
		
		//yengeç burcu
		if(ay.toLowerCase().equals("haziran")) {
			if(gun>22) {
				System.out.println("yengeç burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("temmuz")) {
			if(gun<23) {
				System.out.println("yengeç burcusunuz");
			}			
		}
		
		//aslan burcu
		if(ay.toLowerCase().equals("temmuz")) {
			if(gun>22) {
				System.out.println("aslan burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("aðustos")) {
			if(gun<23) {
				System.out.println("aslan burcusunuz");
			}			
		}
		
		//baþak burcu
		if(ay.toLowerCase().equals("aðustos")) {
			if(gun>22) {
				System.out.println("baþak burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("eylül")) {
			if(gun<=23) {
				System.out.println("baþak burcusunuz");
			}			
		}
		
		//terazi burcu
		if(ay.toLowerCase().equals("eylül")) {
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
		if(ay.toLowerCase().equals("kasým")) {
			if(gun<22) {
				System.out.println("akrep burcusunuz");
			}			
		}
		
		//yay burcu
		if(ay.toLowerCase().equals("kasým")) {
			if(gun>21) {
				System.out.println("yay burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("aralýk")) {
			if(gun<22) {
				System.out.println("yay burcusunuz");
			}			
		}
		
		//oðlak burcu
		if(ay.toLowerCase().equals("aralýk")) {
			if(gun>21) {
				System.out.println("oðlak burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("ocak")) {
			if(gun<22) {
				System.out.println("oðlak burcusunuz");
			}			
		}
		
		//kova burcu
		if(ay.toLowerCase().equals("ocak")) {
			if(gun>21) {
				System.out.println("kova burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("þubat")) {
			if(gun<20) {
				System.out.println("kova burcusunuz");
			}			
		}
		
		//balýk burcu
		if(ay.toLowerCase().equals("þubat")) {
			if(gun>19) {
				System.out.println("balýk burcusunuz");
			}			
		}
		if(ay.toLowerCase().equals("mart")) {
			if(gun<21) {
				System.out.println("balýk burcusunuz");
			}			
		}
		
		
	}

}
