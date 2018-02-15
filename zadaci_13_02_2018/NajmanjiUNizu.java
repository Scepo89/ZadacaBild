package zadaci_13_02_2018;

public class NajmanjiUNizu {
	public static double min(double[ ] niz){
		double najmanji=niz[0];
				for (int i = 1; i < niz.length; i++) {
				if (niz[i] < najmanji) {
						najmanji = niz[i];
					}
				}
				return najmanji;
			}
}

