package zadaci_14_02_2018;

import java.util.Scanner;

public class StedniRacun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		int mjesecniIznos;
		int brojMjeseci;
		double mjesecnaStopa=0.00417;
		System.out.println("Unesite mjesecni iznos");
		mjesecniIznos=unos.nextInt();
		System.out.println("Unesite broj mjeseci nakon koliko zelite znati stanje");
		brojMjeseci=unos.nextInt();
		double racunUkupno=0;


		for(int i =1;i<=brojMjeseci;i++)
		{
			racunUkupno=(mjesecniIznos+racunUkupno)*(1+mjesecnaStopa);
			
			
			
					
			}
		System.out.println("iznos na vasem racunu nakon trazenog broj mjeseci ce biti "+racunUkupno);
		unos.close();
			}

		}
	


