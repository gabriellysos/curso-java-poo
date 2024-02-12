import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int numFuncionario = input.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();

        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = input.nextDouble();

        input.close();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("\nNÚMERO DO FUNCIONÁRIO: %d", numFuncionario);
        System.out.printf("\nSALÁRIO: R$%.2f", salario);
    }
}
