package unrn.oo2.parcial2;

import java.util.Arrays;
import java.util.List;

import unrn.oo2.parcial2.model.FabricaFiguras;
import unrn.oo2.parcial2.model.Figura;
import unrn.oo2.parcial2.model.TipoFigura;

/**
 * Recorrido de una lista con Null Object
 * Tratamiento uniforme de los elementos
 * 
 * @author Alvaro Bayon
 *
 */
public class EjemploNullObject {

	public static void main(String[] args) {

		FabricaFiguras fabrica = new FabricaFiguras();

		List<TipoFigura> tiposFigura = Arrays.asList(TipoFigura.RECTANGULO, TipoFigura.TRIANGULO, TipoFigura.NULA);
		
		for (TipoFigura tipoFigura : tiposFigura) {
			Figura figura = fabrica.crear(tipoFigura);
			
			// Tell, don't ask
			figura.dibujar();
			System.out.println();
		}
		
	}

}
