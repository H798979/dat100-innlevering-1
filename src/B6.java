import javax.swing.JOptionPane;

   public class B6 {
	   public static void main(String[] args) {
		   String InntektStr = JOptionPane.showInputDialog("Inntekt");
		   int inntekt = Integer.parseInt(InntektStr);
		   double trinnskatt = 0;
		   
		   if (inntekt < 208051) {
			   trinnskatt = 0;
			   
		   }else if (inntekt >= 208051 && inntekt <= 292850) {
			   trinnskatt = inntekt * 0.017;
					   
		   }else if (inntekt >= 292851 && inntekt <= 670000) {
			   trinnskatt = inntekt * 0.04;
			   
		   }else if (inntekt >= 670001 && inntekt <= 937900) {
			   trinnskatt = inntekt * 0.136;
		   }else if (inntekt >= 937901 && inntekt <= 1350000) {
			   trinnskatt = inntekt * 0.166;
		   }else if (inntekt >= 1350000) {
			   trinnskatt = inntekt * 0.176;
			   
		   }
		 JOptionPane.showMessageDialog(null, "Trinnskatt" + trinnskatt + "kroner");
	   }

}
