import java.util.Scanner;

public class Lista2_Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double num1, num2, num3, resultado;

        do {
            mostrarMenu();
            opcao = lerOpcao(scanner);

            switch (opcao) {
                case 1:
                    num1 = lerNumero(scanner);
                    num2 = lerNumero(scanner);
                    resultado = somar(num1, num2);
                    imprimirResultado(resultado);
                    break;
                case 2:
                    num1 = lerNumero(scanner);
                    num2 = lerNumero(scanner);
                    resultado = subtrair(num1, num2);
                    imprimirResultado(resultado);
                    break;
                case 3:
                    num1 = lerNumero(scanner);
                    num2 = lerNumero(scanner);
                    resultado = multiplicar(num1, num2);
                    imprimirResultado(resultado);
                    break;
                case 4:
                    num1 = lerNumero(scanner);
                    num2 = lerNumero(scanner);
                    resultado = dividir(num1, num2);
                    imprimirResultado(resultado);
                    break;
                case 5:
                    num1 = lerNumero(scanner);
                    num2 = lerNumero(scanner);
                    num3 = lerNumero(scanner);
                    resultado = calcularMedia(num1, num2, num3);
                    imprimirResultado(resultado);
                    break;
                case 0:
                    System.out.println("Encerrando a calculadora...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nCalculadora Simples");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Média de três números");
        System.out.println("0. Sair");
    }

    public static int lerOpcao(Scanner scanner) {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public static double lerNumero(Scanner scanner) {
        System.out.print("Digite um número: ");
        return scanner.nextDouble();
    }

    public static void imprimirResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
    }

    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}