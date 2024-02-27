import java.util.Scanner;
import javax.swing.*;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		// Clase Math
		// Potencias
		double base = 5;
		double exponente = 3;
		int resultado = (int)Math.pow(base, exponente);
		System.out.println("El resultado de exponer "+base+" en "+exponente+" es "+resultado);
		
		// Raiz cuadrada
		double raiz = 9;
		int resultado_raiz = (int)Math.sqrt(raiz);
		System.out.println("El resultado de la raiz cuadrada de "+raiz+" es "+resultado_raiz);
		// imprimir un formato de numero especifico ej: con 2 decimales
		System.out.print("El numero formateado es ");
		System.out.printf("%1.4f", Math.sqrt(raiz));
		System.out.println("");
		
		// Cadenas
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

		// Ingresar datos por consola con JoptionPane.showInputDialog
		int entrada_edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		System.out.println("El proximo año tendras "+ (entrada_edad+1));
				
		// Ingresar datos por consola con Scanner
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre");
		String entrada_nombre = entrada.nextLine();
		System.out.println("Tu nombre es "+entrada_nombre);
	}

}