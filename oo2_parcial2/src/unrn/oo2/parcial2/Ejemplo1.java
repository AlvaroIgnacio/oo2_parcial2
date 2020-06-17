package unrn.oo2.parcial2;

import java.util.Arrays;
import java.util.List;

import unrn.oo2.parcial2.model.Figura;
import unrn.oo2.parcial2.model.Rectangulo;
import unrn.oo2.parcial2.model.Triangulo;

/**
 * Recorrido normal de una lista chequeando por null
 * No se aplica el patron Null Object
 * 
 * @author Alvaro Bayon
 *
 */
public class Ejemplo1 {

	public static void main(String[] args) {

		List<Figura> figuras = Arrays.asList(new Rectangulo(2,3), new Triangulo(3, 3, 3), null);
		
		for (Figura figura : figuras) {
			// Si no chequeo por null -> NullPointerException
			if (figura!= null)
				figura.dibujar();
			System.out.println();
		}
		
	}

}
