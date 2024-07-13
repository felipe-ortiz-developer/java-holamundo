package logica;

import java.util.Arrays;

public class Reproducir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cancion miCancion = new Cancion("1M");
		Cancion miCancion2 = new Cancion("2M");
//		System.out.println("La duracion de la canción : "+miCancion.getDuracion());
		Cancion[] misCanciones = new Cancion[2];
		misCanciones[0] = miCancion;
		misCanciones[1] = miCancion2;
		
		Arrays.sort(misCanciones);
	}

}
