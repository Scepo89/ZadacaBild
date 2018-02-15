package zadaci_13_02_2018;

public class LokacijaNajvecegUNizu {
	public static int[ ] locateLargest(double[ ][ ] a){
		double najveci=a[0][0];
		int[] najveciPozicija={0,0};
		 for (int i =0;i<a.length;i++){
			 for(int j=0;j<a[0].length;j++)
			 {
				 if(a[i][j]>najveci)
				 {
					 najveci=a[i][j];
					najveciPozicija[0]=i;
					najveciPozicija[1]=j;
					 
				 }
			 }
			 }
		 return najveciPozicija;
	}
}
