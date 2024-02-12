import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor do raio de um círculo: ");
        double raio = input.nextDouble();

        input.close();

        double area = 3.14159 * (Math.pow(raio,2));
        System.out.printf("A área desse círculo é %.4f.", area);
    }
}
