package zadaci_13_02_2018;

public class SortiraniRedovi {
	public static double[ ][ ] sortRows(double[ ][ ] niz){
		for (int i = 0; i < niz.length; i++) {
						for (int j = 0; j < niz[i].length; j++) {
							for (int k = j + 1; k < niz[i].length; k++) {
								if (niz[i][k] < niz[i][j]) {
									double trenutno = niz[i][j];
									niz[i][j] = niz[i][k];
									niz[i][k] = trenutno;
								}
							}
						}
					}
					return niz;
				}
	}

