package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class B5 {

	public static void main(String[] args) {
		
		int poengSum = 0;
		
		int f = 39;
		int e = 49;
		int d = 59;
		int c = 79;
		int b = 89;
		int a = 100;
		
		for (int i = 1; i <= 10; i++) {
			String poengTxt = showInputDialog("Poengsum 1-100: ");
			poengSum = Integer.parseInt(poengTxt);
			
			if (poengSum < 0 || poengSum > 100) {
				i--;
				System.out.println("Ugyldig poengsum, tast inn på nytt");
			} 
		
			if (poengSum > 0 && poengSum <= f) {
				System.out.println("Karakter F");
			} else if (poengSum > f && poengSum <= e) {
				System.out.println("Karakter E");
			} else if (poengSum > e && poengSum <= d) {
				System.out.println("Karakter D");
			} else if (poengSum > d && poengSum <= c) {
				System.out.println("Karakter C");
			} else if (poengSum > c && poengSum <= b) {
				System.out.println("Karakter B");
			} else if (poengSum > b && poengSum <= a) {
				System.out.println("Karakter A");			
			} 
		}
	}
}


