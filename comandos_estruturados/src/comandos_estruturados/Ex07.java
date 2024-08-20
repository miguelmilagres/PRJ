package comandos_estruturados;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double imposto;
		double aliquota;
		double[] salarios = new double[10];
		double[] impostos = new double[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Salário: R$ ");
			salarios[i] = sc.nextDouble();
			
			if (salarios[i] <= 1000) 
			{
				aliquota = 0;
			} 
			else if (salarios[i] <= 2000)
			{
				aliquota = 0.15;
			}
			else if (salarios[i] <= 3000)
			{
				aliquota = 0.25;
			}
			else 
			{
				aliquota = 0.35;
			}
			
			imposto = salarios[i] * aliquota;
			System.out.printf("Imposto: R$ %.2f%n", imposto);
		}
		
		sc.close();

	}

}
