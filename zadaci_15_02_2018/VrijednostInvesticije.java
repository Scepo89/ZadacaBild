package zadaci_15_02_2018;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VrijednostInvesticije {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos =new Scanner(System.in);
int IznosInvesticije;
int BrojGodina;
double InteresnaStopa;
double MjesecnaInteresnaStopa;
double BuduciIznosInvesticije;
System.out.println("Unesite iznos investicije");
IznosInvesticije=unos.nextInt();
System.out.println("Unesite godisnju interesnu stopu");
InteresnaStopa=unos.nextDouble();
System.out.println("uneste broj godina nakon koliko zelite znati stanje");
BrojGodina=unos.nextInt();
MjesecnaInteresnaStopa=InteresnaStopa/1200;
BuduciIznosInvesticije=IznosInvesticije*Math.pow((1+MjesecnaInteresnaStopa),(BrojGodina*12));
DecimalFormat df2 = new DecimalFormat(".##");
System.out.println("Ukupni Iznos investicije nakon"+ BrojGodina+" je: "+df2.format(BuduciIznosInvesticije));
 unos.close();
	}

}

