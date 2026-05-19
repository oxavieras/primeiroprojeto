import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, resultado;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite a operação (+ - * /): ");
        operacao = input.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                break;

            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
        input.close();
    }
}