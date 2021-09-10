package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {

		int n;
		boolean ulovlig;
		
		do {
			String nTXT = showInputDialog("Tast inn ett tall over 0: ");
			n = Integer.parseInt(nTXT);
			ulovlig = (n < 1);
			
			if (ulovlig) {
				System.out.println("Ugyldig n verdi, skriv inn på nytt: ");
			} 
		}	while (ulovlig);
			showMessageDialog(null, n + "! = " + fakultet(n));
		
	}
	public static int fakultet (int grense) {
		int fak = 1;
		for (int tall = 1; tall <= grense; tall++) {
			fak = fak * tall;
		}
		return fak;
	}
}
