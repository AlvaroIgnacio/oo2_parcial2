package unrn.oo2.parcial2.model;

/**
 * Objeto Nulo como Singleton
 * 
 * @author Alvaro Bayon
 *
 */
public class FiguraNulaSingleton implements Figura {
	
	private static Figura instancia = new FiguraNulaSingleton();
	
	private FiguraNulaSingleton() {}
	
	public static Figura getInstancia() {
		return instancia;
	}
	
	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public void dibujar() {
	    System.out.println("Figura NULA: dibujo no disponible.");
	}

}
