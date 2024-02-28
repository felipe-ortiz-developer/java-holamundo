import javax.swing.JOptionPane;

public class BucleWhile {
	public static void main(String[] args) {
		String contraseña = "algoconestilo";
		String pass = "";
		
		while (pass.equals(contraseña)==false) {
			pass = JOptionPane.showInputDialog("Ingrese su contraseña");
			if(pass.equals(contraseña)==false) {
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("Contraseña correcta");
	}
}