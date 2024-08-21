package programacao_orientada_a_objetos;

public class Trapezio implements FiguraGeometrica{

	private double altura;
	private double baseMaior;
	private double baseMenor;
	private double ladoUm;
	private double ladoDois;
	
	public Trapezio(double altura, double baseMaior, double baseMenor, double ladoUm, double ladoDois) {
		super();
		this.altura = altura;
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.ladoUm = ladoUm;
		this.ladoDois = ladoDois;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getLadoUm() {
		return ladoUm;
	}

	public void setLadoUm(double ladoUm) {
		this.ladoUm = ladoUm;
	}

	public double getLadoDois() {
		return ladoDois;
	}

	public void setLadoDois(double ladoDois) {
		this.ladoDois = ladoDois;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (altura / 2) * (baseMaior + baseMenor);
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return baseMaior + baseMenor + ladoUm + ladoDois;
	}
	
}
