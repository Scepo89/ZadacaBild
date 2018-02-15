package zadaci_13_02_2018;

import java.util.Scanner;

public class IndeticniNizoviTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
System.out.print("unesite koliko clanove zelite da imaju nizovi:");
int brojClanova=unos.nextInt();
int[] niz1=new int[brojClanova];
System.out.println("Unesite clanove prvog niza:");
for(int i=0;i<brojClanova;i++){
	
	niz1[i]=unos.nextInt();
}
int[]niz2=new int[brojClanova];
System.out.println("Unesite clanove drugog niza:");
for(int i=0;i<brojClanova;i++){
	niz2[i]=unos.nextInt();
}
if(IndeticniNizovi.equals(niz1, niz2))System.out.println("Nizovi su indeticni");
else System.out.println("Nizovi nisu indeticni");
unos.close();
	}

}
