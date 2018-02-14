package zadaci_12_02_2018;

import java.util.Scanner;

public class SamoglasniciSuglasnici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
String korisnikUnos;
System.out.println("Unesite neki string po zelji");
korisnikUnos=unos.nextLine();
int suglasnik=0;
int samoglasnik=0;
 for(int i=0;i<korisnikUnos.length();i++){
	 if(korisnikUnos.charAt(i)=='a' ||korisnikUnos.charAt(i)=='e'|| korisnikUnos.charAt(i)=='i' || korisnikUnos.charAt(i)=='o' || korisnikUnos.charAt(i)=='u') samoglasnik++;
	 else suglasnik++;
 }
 System.out.println("Broj samoglasnika: "+ samoglasnik+ "\nBroj suglasnika "+suglasnik  );
 unos.close();
	}

}