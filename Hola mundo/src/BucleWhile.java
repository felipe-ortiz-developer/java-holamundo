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
		do {
			intento++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
			if(numero_random < numero) {
				System.out.println("Más bajo");
			}
			if(numero_random > numero) {
				System.out.println("Más alto");
			}
		}
		while(numero_random != numero);
		System.out.println("Correcto. Lo lograste con "+intento+" intentos.");
		
		// Calcular el peso ideal
		String sexo = "";
		do {
			sexo = JOptionPane.showInputDialog("Ingrese su sexo (h/m)");
		} while (sexo.equalsIgnoreCase("m")==false && sexo.equalsIgnoreCase("h")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en cm"));
		int peso_ideal = 0;
		
		if(sexo.equals("h")) {
			peso_ideal = altura - 110;
		}else if(sexo.equals("m")){
			peso_ideal = altura - 120;
		}
		System.out.println("Su peso ideal es "+ peso_ideal);
	}
}