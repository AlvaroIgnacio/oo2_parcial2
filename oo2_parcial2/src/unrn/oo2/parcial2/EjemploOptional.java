package unrn.oo2.parcial2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import unrn.oo2.parcial2.model.FabricaFigurasOptional;
import unrn.oo2.parcial2.model.Figura;
import unrn.oo2.parcial2.model.TipoFigura;

public class EjemploOptional {

	public static void main(String[] args) {

		FabricaFigurasOptional fabrica = new FabricaFigurasOptional();

		List<TipoFigura> tiposFigura = Arrays.asList(TipoFigura.RECTANGULO, TipoFigura.TRIANGULO, null);
		
		for (TipoFigura tipoFigura : tiposFigura) {
			Optional<Figura> figura = fabrica.crear(tipoFigura);

			if (figura.isPresent())
				figura.get().dibujar();
		}
		
		System.out.println();

		for (TipoFigura tipoFigura : tiposFigura) {
			Optional<Figura> figura = fabrica.crear(tipoFigura);

			figura.ifPresent((unaFigura)-> {	
				unaFigura.dibujar();
			});
		}
		
	}

}
