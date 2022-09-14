package clase7sep;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class clase7sep {
	public static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean materia = true;
		int nota1 = 0;
		int nota2 = 0;
		boolean recupera = true;
	
		
		nota1 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese nota 1"));
		
		nota2 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese nota 2"));
		
				materia=(nota1+nota2>=7);
				
				if(materia==true)
					JOptionPane.showMessageDialog(null,"gano el trimestre");
					
					else
						JOptionPane.showMessageDialog(null,"perdio el trimestre");
				
				//switch case (recupera == true)
				  
	
	}
	

}
