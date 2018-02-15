package zadaci_13_02_2018;

import java.util.Scanner;

public class prostiBroj {
	public static boolean isProstiBroj(int broj){
		boolean prost = true;
		for(int i = 2; i < broj; i++){
			if(broj % i == 0){
				prost = false;
			}
		}
		return prost;
	}
public static void prostiBrojeviIspis(int pocetniBroj,int krajnjiBroj, int brojPoRedu){
	int brojProstih=0;
	if(pocetniBroj>krajnjiBroj){
	for(int i=krajnjiBroj;i<=pocetniBroj;i++){
		if(isProstiBroj(i)) {
			brojProstih++;
			if(brojProstih%brojPoRedu!=0)System.out.print(" "+i);
			if(brojProstih%brojPoRedu==0)System.out.println(" "+i);
			
		}
					
	}
								}
	if(pocetniBroj<krajnjiBroj){
		for(int i=pocetniBroj;i<=krajnjiBroj;i++){
			if(isProstiBroj(i)) {				
				brojProstih++;
				if(brojProstih%brojPoRedu!=0)System.out.print(" "+i);
				if(brojProstih%brojPoRedu==0)System.out.println(" "+i);
			}
						
		}
									}
	if(brojProstih==0)System.out.println("nema prostih brojeva");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
int pocetniBroj;
int krajnjiBroj;
int brojPoRedu;
System.out.print("Unesi pocetni broj:");
 pocetniBroj=unos.nextInt();
 System.out.print("Unesi krajnji  broj:");
 krajnjiBroj=unos.nextInt();
 System.out.print("Unesi broj ispisa po jednom redu:");
 brojPoRedu=unos.nextInt();
 prostiBrojeviIspis(pocetniBroj,krajnjiBroj,brojPoRedu);
 unos.close();
	}

}
