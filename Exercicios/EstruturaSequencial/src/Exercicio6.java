import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor decimal A: ");
        double A = input.nextDouble();

        System.out.print("Digite o valor decimal B: ");
        double B = input.nextDouble();

        System.out.print("Digite o valor decimal C: ");
        double C = input.nextDouble();

        input.close();

        double triangulo = (A * C)/2;
        double circulo = 3.14159 * C * C;
        double trapezio = ((A+B)*C)/2;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("""
                
                TRIÂNGULO: %.3f
                CÍRCULO: %.3f
                TRAPÉZIO: %.3f
                QUADRADO: %.3f
                RETÂNGULO: %.3f
                """, triangulo, circulo, trapezio,quadrado, retangulo);

    }
}
