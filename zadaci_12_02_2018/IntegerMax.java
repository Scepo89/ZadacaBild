package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerMax {
	public static Integer najveci(ArrayList<Integer> niz) {
		Integer najveci = 0;
		if (niz.isEmpty()) {
			return null;
		} else {
			for (Integer i:niz) {
				if (i > najveci) {
					najveci = i;
			}
			}
		}
		return najveci;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos= new Scanner(System.in);
		ArrayList<Integer> niz = new ArrayList<Integer>();
		System.out.println(""+najveci(niz));// vracanje null u slucaju da je niz prazan
		System.out.println("Unesi broj clanova niza: ");
		int brojClanova=unos.nextInt();
		System.out.println("Unesi clanove  u nizu");
		for (int i=0; i <brojClanova; i++) {
			
		niz.add(unos.nextInt());
		
		}
		System.out.println("Najveci clan  u nizu je: " + najveci(niz));
		unos.close();
	}

}