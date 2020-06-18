package unrn.oo2.parcial2.model;

import java.util.Optional;

/**
 * Factory de Figuras usando Optional
 * 
 * @author Alvaro Bayon
 *
 */
public class FabricaFigurasOptional {

	public FabricaFigurasOptional() {
	}
	
	public Optional<Figura> crear(TipoFigura figura) {
		switch (figura) {
			case RECTANGULO:
				return Optional.of(new Rectangulo(2,3));
			case TRIANGULO:
				return Optional.of(new Triangulo(3, 3, 3));
			default:
				return Optional.empty();
		}
	}
	
}
