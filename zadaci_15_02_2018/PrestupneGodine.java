package zadaci_15_02_2018;
import java.util.Scanner;
public class PrestupneGodine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
int pocetna;
int krajnja;
int brojPoLiniji=0;
System.out.println("unesite pocetnu godinu:");
pocetna=unos.nextInt();
System.out.println("unesite krajnju godinu:");
krajnja=unos.nextInt();
System.out.println("Sve prestupne godine u zadanom intervalu su :");
for(int i =pocetna;i<=krajnja;i++){
	if(i%4==0){
		brojPoLiniji++;
		if(brojPoLiniji%10==0) System.out.println(" "+i);
		if(brojPoLiniji%10!=0) System.out.print(" "+i);
		
	}
	unos.close();
}
	}

}
