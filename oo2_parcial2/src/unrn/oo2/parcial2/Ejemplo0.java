package unrn.oo2.parcial2;

import java.util.Collections;
import java.util.List;

import unrn.oo2.parcial2.model.FabricaFiguras;
import unrn.oo2.parcial2.model.Figura;
import unrn.oo2.parcial2.model.TipoFigura;

public class Ejemplo0 {

	public static void main(String[] args) {

		FabricaFiguras fabrica = new FabricaFiguras();

		List<TipoFigura> tiposFigura = Collections.emptyList();
		
		for (TipoFigura tipoFigura : tiposFigura) {
			Figura figura = fabrica.crear(tipoFigura);
			figura.dibujar();
			System.out.println();
		}
		
	}

}
