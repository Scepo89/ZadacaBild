package zadaci_15_02_2018;

import java.util.Scanner;

public class Palindrom {
	 public static int reverse(int number) {
		
		 String zamjena =""+number;
			String unazad="";
			for(int i= zamjena.length()-1;i>=0;i--)
			{
			unazad=unazad+zamjena.charAt(i)	;
			
			}
			int broj = Integer.parseInt(unazad);
			return broj;
	 }
	 public static boolean isPalindrome(int number){
		 boolean palindrom=false;
		 if(number==reverse(number))palindrom=true;
		 return palindrom;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
System.out.println("Unesite neki broj int tipa");
int broj=unos.nextInt();
if(isPalindrome(broj)){
System.out.println("Broj koji ste unijeli je palindrom");
}
else System.out.println("broj nije palindrom");
unos.close();
	}

}
