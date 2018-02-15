package zadaci_13_02_2018;

import java.util.Scanner;

public class NajmanjiUNizuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
int clanovi;
System.out.println("Unesite koliko zelite clanova da ima niz");
clanovi=unos.nextInt();
double[] niz= new double[clanovi];
System.out.print("Unesite clanove niza");
for(int i =0;i<niz.length;i++){
	niz[i]=unos.nextDouble();
}
System.out.println("najmanji clan niza koji ste unijeli je: "+ NajmanjiUNizu.min(niz));
unos.close();
	}

}
