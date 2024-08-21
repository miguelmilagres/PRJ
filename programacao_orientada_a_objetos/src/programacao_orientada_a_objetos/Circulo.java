package programacao_orientada_a_objetos;

public class Circulo implements FiguraGeometrica{

	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(raio, 2) * Math.PI;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * raio;
	}
	
	
}
