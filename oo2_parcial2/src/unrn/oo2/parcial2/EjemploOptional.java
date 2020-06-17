package unrn.oo2.parcial2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import unrn.oo2.parcial2.model.FabricaFigurasOptional;
import unrn.oo2.parcial2.model.Figura;
import unrn.oo2.parcial2.model.TipoFigura;

/**
 * Uso de Optional para representar elementos que pueden ser nulos.
 * 
 * @author Alvaro Bayon
 *
 */
public class EjemploOptional {

	public static void main(String[] args) {

		FabricaFigurasOptional fabrica = new FabricaFigurasOptional();

		List<TipoFigura> tiposFigura = Arrays.asList(TipoFigura.RECTANGULO, TipoFigura.TRIANGULO, TipoFigura.NULA);
		
		// Uso de isPresent() - get()
		for (TipoFigura tipoFigura : tiposFigura) {
			Optional<Figura> optionalFigura = fabrica.crear(tipoFigura);

			if (optionalFigura.isPresent()) {
				Figura figura = optionalFigura.get();
				figura.dibujar();				
			}
		}
		
		System.out.println();

		// Uso de ifPresent()
		for (TipoFigura tipoFigura : tiposFigura) {
			Optional<Figura> optionalFigura = fabrica.crear(tipoFigura);

			optionalFigura.ifPresent( figura -> {	
				figura.dibujar();
				System.out.println();
			});
		}
		
	}

}
