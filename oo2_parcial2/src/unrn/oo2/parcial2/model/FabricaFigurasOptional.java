package unrn.oo2.parcial2.model;

import java.util.HashMap;
import java.util.Optional;

public class FabricaFigurasOptional {

	private HashMap<TipoFigura, Figura> templateFigura = new HashMap<>();

	public FabricaFigurasOptional() {
		this.templateFigura.put(TipoFigura.RECTANGULO, new Rectangulo(2,3));
		this.templateFigura.put(TipoFigura.TRIANGULO, new Triangulo(3, 3, 3));
		this.templateFigura.put(TipoFigura.NULA, null);
	}
	
	public Optional<Figura> crear(TipoFigura figura) {
		return Optional.ofNullable(this.templateFigura.get(figura));
	}
	
}
