package zadaci_15_02_2018;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DuzinaPiste {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		double brzina;
		double ubrzanje;
		System.out.println("unesite brzinu");
		brzina = unos.nextDouble();
		System.out.println("unesite ubrzanje");
		ubrzanje = unos.nextDouble();
		double duzinaPiste;
		duzinaPiste=((brzina*brzina)/(2*ubrzanje));
	     DecimalFormat df2 = new DecimalFormat(".#");
		System.out.println("Potrebna duzina piste je " + df2.format(duzinaPiste) +" metara");
		unos.close();
	}

}
