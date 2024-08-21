package programacao_orientada_a_objetos;

public class Retangulo implements FiguraGeometrica{

	private double lado;
	private double altura;
	
	public Retangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado * altura;
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * (lado + altura);
	}
	
	
}
