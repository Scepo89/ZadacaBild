package zadaci_14_02_2018;

import java.util.Scanner;

public class BrojeviObrnutRedosled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		System.out.println("Unefsite jedan visecifreni broj");
		int broj=unos.nextInt();
		String zamjena =""+broj;
		String unazad="";
		for(int i= zamjena.length()-1;i>=0;i--)
		{
		unazad=unazad+zamjena.charAt(i)	;
		
		}

		System.out.println("uneseni broj napisan naopako: "+unazad);
unos.close();
	}

}
