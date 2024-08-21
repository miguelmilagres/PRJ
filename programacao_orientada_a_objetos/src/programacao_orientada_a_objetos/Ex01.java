package programacao_orientada_a_objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<FiguraGeometrica> figuras = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Retângulo");
            System.out.println("2. Adicionar Triângulo");
            System.out.println("3. Adicionar Círculo");
            System.out.println("4. Adicionar Trapézio");
            System.out.println("5. Listar todas as figuras (Área e Perímetro)");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    System.out.println("Digite a largura do retângulo:");
                    double larguraRetangulo = scanner.nextDouble();
                    System.out.println("Digite a altura do retângulo:");
                    double alturaRetangulo = scanner.nextDouble();
                    figuras.add(new Retangulo(larguraRetangulo, alturaRetangulo));
                    break;
                case 2:
                    System.out.println("Digite a base do triângulo:");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Digite a altura do triângulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    System.out.println("Digite o lado do triângulo:");
                    double ladoTriangulo = scanner.nextDouble();
                    figuras.add(new Triangulo(alturaTriangulo, baseTriangulo, ladoTriangulo));
                    break;
                case 3:
                    System.out.println("Digite o raio do círculo:");
                    double raioCirculo = scanner.nextDouble();
                    figuras.add(new Circulo(raioCirculo));
                    break;
                case 4:
                    System.out.println("Digite a base maior do trapézio:");
                    double baseMaiorTrapezio = scanner.nextDouble();
                    System.out.println("Digite a base menor do trapézio:");
                    double baseMenorTrapezio = scanner.nextDouble();
                    System.out.println("Digite a altura do trapézio:");
                    double alturaTrapezio = scanner.nextDouble();
                    System.out.println("Digite o lado A do trapézio:");
                    double ladoATrapezio = scanner.nextDouble();
                    System.out.println("Digite o lado B do trapézio:");
                    double ladoBTrapezio = scanner.nextDouble();
                    figuras.add(new Trapezio(alturaTrapezio, baseMaiorTrapezio, baseMenorTrapezio, ladoATrapezio, ladoBTrapezio));
                    break;
                case 5:
                    System.out.println("Listando todas as figuras:");
                    for (FiguraGeometrica figura : figuras) {
                        System.out.println("Área: " + figura.area() + ", Perímetro: " + figura.perimetro());
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
