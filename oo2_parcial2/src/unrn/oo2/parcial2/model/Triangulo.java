package unrn.oo2.parcial2.model;

public class Triangulo implements Figura {

    private final double a;
    private final double b;
    private final double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }	
    
	@Override
	public double perimetro() {
        return this.a + this.b + this.c;
	}

	@Override
	public void dibujar() {
	    System.out.println("Dibujando un Triangulo con perimetro: " + this.perimetro());
	}
	
}
