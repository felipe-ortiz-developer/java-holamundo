public class Arrays {
	public static void main(String[] args) {
		// Arrays
		// Formas de inicializar
		int [] miArray2 = new int [5]; // Queda para siempre con ese largo
		System.out.println(miArray2); // Da "[I@372f7a8d"
		System.out.println(miArray2[0]); // Da 0
		System.out.println(miArray2[1]); // Da 0
		
		int [] miArray = {0,1,2,3,6}; // Queda para siempre con ese largo
		System.out.println(miArray[4]); // Da 6
		// System.out.println(miArray[5]); // Da error no existe
		miArray[4] = 11; // Puedo sobre escribir los valores de los indices
		System.out.println(miArray[4]);
		
		System.out.println("Recorriendo con for");
		for (int i = 0; i < miArray.length; i++) {
			System.out.println(miArray[i]);
		}
		
		// ForEach o "for mejorado", recorre cada elemento del array
		for (int elemento : miArray) {
			System.out.println("for mejorado: "+elemento);
		}
	}
}