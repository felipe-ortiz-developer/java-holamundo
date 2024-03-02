
public class Cadenas {
	public static void main(String[] args) {
		// Char
		// Observaciones: Debe ir con comillas simples o no sabe que es un char 
		char letra = 'F';
		System.out.println("Char: "+letra);
		
		// String
		String nombre = "Felipe";
		int numero = nombre.length();
		System.out.println("Mi nombre es " + nombre + " y tiene " + numero + " letras");
		System.out.println("La primera letra es " + nombre.charAt(0));
		System.out.println("La ultima letra es " + nombre.charAt(numero-1));
		
		String frase = "Este es un curso de java para aprender a programar";
		String resumen = frase.substring(0, frase.length());
		System.out.println("El resumen es: " + resumen);
		
		String comparado = "felipe";
		System.out.println(comparado.equals(nombre));
		System.out.println(comparado.equalsIgnoreCase(nombre));
	}
}
