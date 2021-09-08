package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class B4 {

	public static void main(String[] args) {
		String bruttoTxt = showInputDialog("Bruttoinntekt: ");
		int brutto = Integer.parseInt(bruttoTxt);
		
		int t1 = 164100;
		int t2 = 230950;
		int t3 = 580650;
		int t4 = 934050;
		
		double s1 = 0.0093;
		double s2 = 0.0241;
		double s3 = 0.1152;
		double s4 = 0.1452;
		
		if (brutto <= t1) {
			System.out.println(" Du betaler ingen trinnskatt");
		} else if (brutto <= t2) {
			System.out.println(Math.round((brutto * s1)*100.0)/100.0 + "kr." + "Du betaler 0,93% i trinnskatt");
		} else if (brutto <= t3) {
			System.out.println(Math.round((brutto * s2)*100.0)/100.0 + "kr." + " Du betaler 2,41% i trinnskatt");
		} else if (brutto <= t4) {
			System.out.println(Math.round((brutto * s3)*100.0)/100.0 + "kr." + " Du betaler 11,52% i trinnskatt");
		} else if (brutto > t4) {
			System.out.println(Math.round((brutto * s4)*100.0)/100.0 + "kr." + " Du betaler 14,52% i trinnskatt");
		}
	}
}
