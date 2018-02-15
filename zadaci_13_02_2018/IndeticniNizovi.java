package zadaci_13_02_2018;

public class IndeticniNizovi {
	
		public static boolean equals(int[] niz1, int[] niz2) {
				boolean equals = true;
					for (int i = 0; i < niz1.length; i++) {
						if (niz1[i] != niz2[i]) {
							equals = false;
						}
					}
					return equals;
				}
		
	}

