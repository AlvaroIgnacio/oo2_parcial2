package unrn.oo2.parcial2.model;

/**
 * Factory de Figuras aplicando el patron Objeto Nulo
 * 
 * @author Alvaro Bayon
 *
 */
public class FabricaFiguras {

	private Figura nula = new FiguraNula();

	public FabricaFiguras() {
	}
	
	public Figura crear(TipoFigura figura) {
		switch (figura) {
			case RECTANGULO:
				return new Rectangulo(2,3);
			case TRIANGULO:
				return new Triangulo(3, 3, 3);
			default:
				return this.nula;
				//return FiguraNulaSingleton.getInstancia();
		}
	}
	
}
