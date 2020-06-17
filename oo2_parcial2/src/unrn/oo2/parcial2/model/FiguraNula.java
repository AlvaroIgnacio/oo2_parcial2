package unrn.oo2.parcial2.model;

public class FiguraNula implements Figura {

	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public void dibujar() {
	    System.out.println("Figura NULA: dibujo no disponible.");
	}

}
