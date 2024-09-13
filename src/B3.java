import javax.swing.JOptionPane;

public class B3 {

	public static void main(String[] args) {
		String inputXStr = JOptionPane.showInputDialog("Angi Verdi for x");
		double x = Double.parseDouble(inputXStr);
		
		String inputNStr = JOptionPane.showInputDialog("Angi Verdi for n");
		int n = Integer.parseInt(inputNStr);
		
		if (n <= 0) {
			JOptionPane.showMessageDialog(null, "n må være et posetivt heltall");
			return;
		
		}
		double result = Math.pow(x, n);
				
	JOptionPane.showMessageDialog(null, "verdien av " + x + " ^ " + n + " er" + result);			
	}
}
