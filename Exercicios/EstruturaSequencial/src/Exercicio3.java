import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        int A = input.nextInt();

        System.out.print("Digite o 2º valor: ");
        int B = input.nextInt();

        System.out.print("Digite o 3º valor: ");
        int C = input.nextInt();

        System.out.print("Digite o 4º valor: ");
        int D = input.nextInt();

        input.close();

        int produtoAB = A * B;
        int produtoCD = C * D;
        int diferenca = produtoAB - produtoCD;

        System.out.printf("\nO produto do 1º e 2º valor é: %d\n", produtoAB);
        System.out.printf("O produto do 3º e 4º valor é: %d\n", produtoCD);
        System.out.printf("A diferença entre os produtos é: %d", diferenca);
    }
}
