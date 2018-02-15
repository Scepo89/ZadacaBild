package zadaci_14_02_2018;
import java.util.Scanner;
public class BrojSlovaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos= new Scanner(System.in);
System.out.println("unesite string");
String korisnikovUnos=unos.nextLine();
int brojSlova=0;
for(int i=0;i<korisnikovUnos.length();i++){
	char ch=korisnikovUnos.charAt(i);
	if(Character.isLetter(ch)) brojSlova++;
}
System.out.print("Broj slova u unesenom stringu je: "+brojSlova);
unos.close();
	}

}
