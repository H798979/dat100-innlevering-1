package no.hvl.dat100;
import javax.swing.JOptionPane;

public class G3 {

  public static void main(String[] args) {
	  String NedregrenseStr = JOptionPane.showInputDialog("Nedre grense:");
	  int Nedregrense = Integer.parseInt (NedregrenseStr);
	  String OvregrenseStr = JOptionPane.showInputDialog("Ovre grense:");
	  int Ovregrense = Integer.parseInt (OvregrenseStr);
	  
	  StringBuilder oddetall = new StringBuilder();
	  if (Nedregrense % 2 == 0) {
          Nedregrense++; }
      for (int i = Nedregrense; i <= Ovregrense; i += 2) {
              oddetall.append(i).append(", ");}    
      if (oddetall.length() > 0) {
                  oddetall.setLength(oddetall.length() - 2);
      }              
                
 JOptionPane.showMessageDialog(null, "Oddetallene er: " + oddetall.toString());
  }
	  
        
}