package git_kaulins;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	static int mestKaulinu(int reizes) {
		int lielakais = 0, skaitlis;
		Random rand = new Random();
		for(int i=0; i<reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			lielakais = lielakais(lielakais, skaitlis);
		System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
		return lielakais;
	}
		public static void main(String[] args) {
			int lielakais;
			Scanner scan = new Scanner(System.in);
			int reizes;
			do {
			System.out.println("Cik reizes mest kauliņu?");
			reizes = scan.nextInt();
			}while(reizes<1);
			scan.close();
			lielakais = mestKaulinu(reizes);
			System.out.println("Lielākais skaitlis ir "+lielakais);
	}
		static int lielakais(int lielakais, int skaitlis) {
			if (lielakais > skaitlis) {
				return lielakais;
			} else {
				return skaitlis;	
			}
		}

}
