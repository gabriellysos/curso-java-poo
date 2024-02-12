import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código da peça: ");
        int codigoPeca1 = input.nextInt();

        System.out.print("Digite a quantidade de peças: ");
        int qntPeca1 = input.nextInt();

        System.out.print("Digite o valor unitário da peça: ");
        double valorPeca1 = input.nextDouble();

        double totalPeca1 = qntPeca1 * valorPeca1;


        System.out.print("\nDigite o código da peça: ");
        int codigoPeca2 = input.nextInt();

        System.out.print("Digite a quantidade de peças: ");
        int qntPeca2 = input.nextInt();

        System.out.print("Digite o valor unitário da peça: ");
        double valorPeca2 = input.nextDouble();

        double totalPeca2 = qntPeca2 * valorPeca2;

        input.close();

        System.out.printf("""
                
                CÓDIGO | QNT | VALOR UNIT | VALOR TOTAL
                   %d     %d      %.2f         %.2f
                   %d     %d      %.2f         %.2f
                """, codigoPeca1, qntPeca1, valorPeca1, totalPeca1, codigoPeca2, qntPeca2, valorPeca2, totalPeca2);

        System.out.printf("Total a pagar: %.2f", totalPeca1 + totalPeca2);
    }
}
