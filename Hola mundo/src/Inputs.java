import java.util.Scanner;
import javax.swing.JOptionPane;

public class Inputs {
	public static void main(String[] args) {
		// Por alguna razón no se pueden ejecutar los 2 si primero se parte con scanner
		// Ingresar datos por consola con JoptionPane.showInputDialog
		//int entrada_edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		//System.out.println("El proximo año tendras "+ (entrada_edad+1));
		
		// Ingresar datos por consola con Scanner
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre");
		String entrada_nombre = entrada.nextLine();
		System.out.println("Tu nombre es "+entrada_nombre);
		entrada.close();
		
	}
}