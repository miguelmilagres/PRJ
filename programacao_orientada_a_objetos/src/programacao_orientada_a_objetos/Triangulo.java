package programacao_orientada_a_objetos;

public class Triangulo implements FiguraGeometrica {

	private double altura;
	private double base;
	private double lado;
	
	public Triangulo(double altura, double base, double lado) {
		this.altura = altura;
		this.base = base;
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base * altura) / 2;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado * 3;
	}
	
	
}
