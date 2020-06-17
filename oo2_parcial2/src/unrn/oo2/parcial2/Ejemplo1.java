package unrn.oo2.parcial2;

import java.util.Arrays;
import java.util.List;

import unrn.oo2.parcial2.model.FabricaFiguras;
import unrn.oo2.parcial2.model.Figura;
import unrn.oo2.parcial2.model.TipoFigura;

public class Ejemplo1 {

	public static void main(String[] args) {

		FabricaFiguras fabrica = new FabricaFiguras();

		List<TipoFigura> tiposFigura = Arrays.asList(TipoFigura.RECTANGULO, TipoFigura.TRIANGULO, null);
		
		for (TipoFigura tipoFigura : tiposFigura) {
			Figura figura = fabrica.crear(tipoFigura);

			// Si no chequeo por null -> NullPointerException
			if (figura!= null)
				figura.dibujar();
			System.out.println();
		}
		
	}

}
