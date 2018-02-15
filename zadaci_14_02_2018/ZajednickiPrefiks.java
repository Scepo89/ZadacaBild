package zadaci_14_02_2018;
import java.util.Scanner;
public class ZajednickiPrefiks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos=new Scanner(System.in);
System.out.println("Unesite string");
String prvi=unos.nextLine();
System.out.println("Unesite jos jedan string ");
String drugi=unos.nextLine();
String prefiks="";
int manji=Math.min(prvi.length(), drugi.length());

for(int i=0; i<manji; i++){
	if(prvi.charAt(i)==drugi.charAt(i)){
		prefiks=prefiks+prvi.charAt(i);
	}
}

if(prefiks.isEmpty()){
	System.out.println("Nema zajednicog prefiksa.");
}else{
	System.out.println("Zajednicki prefiks je: "+prefiks);
}
unos.close();
	}
	
	}


