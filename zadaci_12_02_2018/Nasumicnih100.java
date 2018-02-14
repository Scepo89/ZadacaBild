package zadaci_12_02_2018;

public class Nasumicnih100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] niz = new int[10];
		
				for (int i = 0; i < 100; i++) {
					int broj = (int) (Math.random() * 10);
					niz[broj]++;
				}
		
				for (int i = 0; i < niz.length; i++) {
					System.out.println("broj "+ i + " se pojavljuje "+ niz[i]+ " puta");
				}
		
			}
		
		}
	

