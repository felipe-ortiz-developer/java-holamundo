
public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		// Clase Math
		double base = 5;
		double exponente = 3;
		int resultado = (int)Math.pow(base, exponente);
		System.out.println("El resultado es "+resultado);
		
		// Cadenas
		String nombre = "Felipe";
		int numero = nombre.length();
		System.out.println("Mi nombre es " + nombre + " y tiene " + numero + " letras");
		System.out.println("La primera letra es " + nombre.charAt(0));
		System.out.println("La ultima letra es " + nombre.charAt(numero-1));
	}

}
