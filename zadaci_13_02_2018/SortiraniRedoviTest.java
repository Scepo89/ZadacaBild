package zadaci_13_02_2018;

import java.util.Scanner;

public class SortiraniRedoviTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
System.out.print("Unesite koliko clanova zelite da ima niz(niz je simetrican)");
int brojClanova=unos.nextInt();
System.out.println("Unesite clanove niza");
double[][] niz=new double[brojClanova][brojClanova];
for(int i=0;i<brojClanova;i++){
	for(int j=0;j<brojClanova;j++){
		niz[i][j]=unos.nextDouble();
	}
}
for(int i=0;i<niz.length;i++){
	for(int j=0;j<niz[i].length;j++){
		System.out.print(" "+niz[i][j]);
unos.close();
	}
System.out.println();
}
System.out.println("Sortiran niz:");
for(int i=0;i<niz.length;i++){
	for(int j=0;j<niz[i].length;j++){
		System.out.print(" "+SortiraniRedovi.sortRows(niz)[i][j]);

	}
System.out.println();
	}

}}
