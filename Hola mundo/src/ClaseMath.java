public class ClaseMath {
	public static void main(String[] args) {
		// Potencias
		double base = 5;
		double exponente = 3;
		int resultado = (int)Math.pow(base, base);
		System.out.println("El resultado de exponer "+base+" en "+exponente+" es "+resultado);
		
		// Raiz cuadrada
		double raiz = 9;
		int resultado_raiz = (int)Math.sqrt(raiz);
		System.out.println("El resultado de la raiz cuadrada de "+raiz+" es "+resultado_raiz);
		// imprimir un formato de numero especifico ej: con 2 decimales
		System.out.print("El numero formateado es ");
		System.out.printf("%1.4f", Math.sqrt(raiz));
		
		//Random
		int nuumero_random = (int)(Math.random()*100);
		System.out.println("\nEl numero random es: "+nuumero_random);
	}
}