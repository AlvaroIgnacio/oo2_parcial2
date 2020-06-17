package unrn.oo2.parcial2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import unrn.oo2.parcial2.model.TipoFigura;

/**
 * Listas vacias como Objetos Nulos
 * 
 * @author Alvaro Bayon
 *
 */
public class Ejemplo0 {

	public static void main(String[] args) {

		List<TipoFigura> tiposFigura = Collections.emptyList();
		List<TipoFigura> otros = new ArrayList<>();
		
		//Union de listas vacias
		tiposFigura.addAll(otros);
		
		System.out.println(tiposFigura.size());
		
		// Recorrido sobre una lista vacia
		for (TipoFigura tipoFigura : tiposFigura) {
			System.out.println(tipoFigura.toString());
		}
		
	}

}
