package zadaci_12_02_2018;

import java.util.Scanner;

public class NajveciUNizuBrojPonavljanja {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
System.out.println("Unesite koliko zelite brojeva(0 prekida unos)");
int brojevi;
int najveci=0;
int najveciBrojac=1;

	do{
		brojevi=unos.nextInt();
		if (brojevi == najveci) {
			najveciBrojac++;
		}
		if (brojevi > najveci) {
			najveci = brojevi;
			najveciBrojac=1;
		}
		
	}while(brojevi!=0);

System.out.println("najveci uneseni broj je: "+ najveci +" i ponavlja se: "+ najveciBrojac);
unos.close();
	}

}
