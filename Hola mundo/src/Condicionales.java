import javax.swing.JOptionPane;

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
		
		switch (edad) {
			case 1:
				System.out.println("Eres un bebe");
				break;
			case 2:
				System.out.println("Eres un niño");
				break;
			default: 
				System.out.println("Eres adulto");
				break;
		}
	}
}
