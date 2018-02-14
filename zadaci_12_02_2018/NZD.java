package zadaci_12_02_2018;

import java.util.Scanner;

public class NZD {
	public static int nzd(int a, int b)
	  {
		int najveci=1;
		for(int i=1; i<=Math.min(a, b); i++)
		{
			if(Math.min(a, b)%i==0)najveci=i;
			
		}
		return najveci;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
System.out.println("Uneiste dva broja int tipa");
int prvi; int drugi;
prvi=unos.nextInt();
drugi=unos.nextInt();
int najveciZD;
najveciZD=nzd(prvi,drugi);
System.out.println("Najveci zajednicki djelilac za unesene brojeve je: "+ najveciZD);
unos.close();
	}

}
