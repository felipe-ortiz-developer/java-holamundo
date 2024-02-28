import javax.swing.JOptionPane;
import javax.swing.event.SwingPropertyChangeSupport;

public class Condicionales {
	public static void main(String[] args) {
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
		
		if(edad < 18) {
			System.out.println("Eres joven");
		}else if(edad >= 18) {
			System.out.println("Eres adulto");
		}else {
			System.out.println("Eres adulto mayor");
		}
		
		
	}
}
