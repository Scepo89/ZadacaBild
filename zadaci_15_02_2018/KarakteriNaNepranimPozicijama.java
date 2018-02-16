package zadaci_15_02_2018;

import java.util.Scanner;

public class KarakteriNaNepranimPozicijama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
System.out.println("Unesite neki string");
String KorisnikovUnos=unos.nextLine();

for(int i =0;i<KorisnikovUnos.length();i=i+2){
	System.out.print(""+KorisnikovUnos.charAt(i));
}
unos.close();
	}

}
