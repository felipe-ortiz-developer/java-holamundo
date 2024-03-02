import javax.swing.JOptionPane;

public class BucleFor {
	public static void main(String[] args) {
		// Para buscar un caracter entre un string
		String email = JOptionPane.showInputDialog("Ingresa tu email");
		boolean arroba = false;
		for (int i = 0; i < email.length(); i++) {
			if(email.charAt(i)=='@') {
				arroba = true;
			}
		}
		
		if(arroba) {
			System.out.println("Es un correo electronico valido");	
		}else {
			System.out.println("No es un correo electronico valido");
		}
		
	}
}