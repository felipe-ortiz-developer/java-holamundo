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
		
		/* Juego de adivina el numero */
		System.out.println("Juego de adivina el numero");
		int numero_random = (int) (Math.random()*100);
		int numero = 0;
		int intento = 0;
		while(numero_random != numero) {
			intento++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
			if(numero_random < numero) {
				System.out.println("Más bajo");
			}
			if(numero_random > numero) {
				System.out.println("Más alto");
			}
		}
		System.out.println("Correcto. Lo lograste con "+intento+" intentos.");
	}
}