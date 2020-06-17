package unrn.oo2.parcial2.model;

public class Rectangulo implements Figura {
	private final double ancho;
	private final double largo;

	public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

	@Override
	public double perimetro() {
		return (this.ancho + this.largo) * 2;
	}

	@Override
	public void dibujar() {
	    System.out.println("Dibujando un Rectangulo con perimetro: " + this.perimetro());
	}

	
}
