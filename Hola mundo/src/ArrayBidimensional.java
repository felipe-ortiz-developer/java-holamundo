public class ArrayBidimensional {
	public static void main(String[] args) {
		int [][] arrayBidimensional = new int [4][4];
		
		arrayBidimensional[0][0] = 00;
		arrayBidimensional[0][1] = 01;
		arrayBidimensional[0][2] = 02;
		arrayBidimensional[0][3] = 03;
		
		arrayBidimensional[1][0] = 10;
		arrayBidimensional[1][1] = 11;
		arrayBidimensional[1][2] = 12;
		arrayBidimensional[1][3] = 13;
		
		arrayBidimensional[2][0] = 20;
		arrayBidimensional[2][1] = 21;
		arrayBidimensional[2][2] = 22;
		arrayBidimensional[2][3] = 23;
		
		arrayBidimensional[3][0] = 30;
		arrayBidimensional[3][1] = 31;
		arrayBidimensional[3][2] = 32;
		arrayBidimensional[3][3] = 33;
		
		// Otra forma de declarar el array bidimensional
		int [][] arrayBidimensional2 = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}
		};
		
		// como recorrer el array con for
		for (int i = 0; i < arrayBidimensional.length; i++) {
			for (int j = 0; j < arrayBidimensional[i].length; j++) {
				System.out.println(arrayBidimensional[i][j]);
			}
		}
		
		System.out.println("Con forEach");
		// como recorrer el array con for mejorado (forEach)
		for (int[] is : arrayBidimensional2) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
		
	}
}