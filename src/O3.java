import javax.swing.JOptionPane;
      
      public class O3 {
    	  public static void main(String[] args) {
    		  String inputStr = JOptionPane.showInputDialog("Gi et heltall");
    		  int n = Integer.parseInt(inputStr);
    		  
    		  if (n <= 0) {
    			  JOptionPane.showMessageDialog(null, "Tall må være større en null");
    			  return;
    		  }
    		  
    		  long factorial = calculateFactorial(n);
    		  
    		  JOptionPane.showMessageDialog(null, "Fakultet av " + n + "er: " + factorial);
    	  }
    	  public static long calculateFactorial (int n) {
    		  long result = 1;
    		  for (int i = 1; i <= n; i++) {
    			  result *= i;
    		  }
    		  return result;
    		  
    	  }

}
