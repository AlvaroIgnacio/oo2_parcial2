package unrn.oo2.parcial2.model;

import java.util.HashMap;

/**
 * Factory de Figuras aplicando el patron Objeto Nulo
 * 
 * @author Alvaro Bayon
 *
 */
public class FabricaFiguras {

	private HashMap<TipoFigura, Figura> templateFigura = new HashMap<>();

	public FabricaFiguras() {
		// FiguraNula no tiene estado -> puedo asignar una unica instancia
		Figura nula = new FiguraNula();
		this.templateFigura.put(TipoFigura.RECTANGULO, new Rectangulo(2,3));
		this.templateFigura.put(TipoFigura.TRIANGULO, new Triangulo(3, 3, 3));
		
		// Uso del patron Objeto Nulo
		this.templateFigura.put(TipoFigura.NULA, nula);
	}
	
	public Figura crear(TipoFigura figura) {
		return this.templateFigura.get(figura);
	}
	
}
