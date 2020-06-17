package unrn.oo2.parcial2.model;

import java.util.HashMap;

public class FabricaFiguras {

	private HashMap<TipoFigura, Figura> templateFigura = new HashMap<>();

	public FabricaFiguras() {
		this.templateFigura.put(TipoFigura.RECTANGULO, new Rectangulo(2,3));
		this.templateFigura.put(TipoFigura.TRIANGULO, new Triangulo(3, 3, 3));
		this.templateFigura.put(TipoFigura.NULA, new FiguraNula());
	}
	
	public Figura crear(TipoFigura figura) {
		return this.templateFigura.get(figura);
	}
	
}