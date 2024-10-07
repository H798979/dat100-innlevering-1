import javax.swing.JOptionPane;

public class B5 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		String PoengsumStr = JOptionPane.showInputDialog("Poengsum" + (i + 1));
		int Poengsum = Integer.parseInt (PoengsumStr);
		String karakter;
		
		
	
		 if (Poengsum < 0 || Poengsum > 100) {
			karakter = "Ugyldig peongsum";
		} else if (Poengsum >= 90) {
			karakter = "A";
			
		} else if (Poengsum >= 80) {
			karakter = "B";
			
		} else if (Poengsum >= 60) {
			karakter = "C";
			
		} else if (Poengsum >= 50) {
			karakter = "D";
			
		} else if (Poengsum >= 40) {
			karakter = "E";
			
		} else  {
			karakter = "F";
	}
		JOptionPane.showMessageDialog(null, "Karakter: " + (i + 1) + " - Karakter: "+ karakter);
  
 }
	}
}