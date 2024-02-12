import java.util.Scanner;
public class Exercicio0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a largura do terreno retangular: ");
        double largura = input.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = input.nextDouble();

        System.out.print("Digite o valor do m²: ");
        double valorMetroQuadrado = input.nextDouble();

        input.close();

        double area = largura * comprimento;
        double valorTerreno = area * valorMetroQuadrado;

        System.out.printf("ÁREA: %.2f\n", area);
        System.out.printf("VALOR DO TERRENO: %.2f", valorTerreno);
    }
}
