import java.util.Scanner;

public class Lista2_Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[10];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Preencher vetor de notas");
            System.out.println("2. Mostrar menor nota");
            System.out.println("3. Mostrar todas as notas");
            System.out.println("4. Mostrar soma das notas");
            System.out.println("5. Buscar uma nota");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    preencherNotas(scanner, notas);
                    break;
                case 2:
                    double menorNota = encontrarMenorNota(notas);
                    System.out.println("A menor nota é: " + menorNota);
                    break;
                case 3:
                    imprimirNotas(notas);
                    break;
                case 4:
                    double somaNotas = calcularSomaNotas(notas);
                    System.out.println("A soma das notas é: " + somaNotas);
                    break;
                case 5:
                    System.out.print("Digite a nota que deseja buscar: ");
                    double notaBusca = scanner.nextDouble();
                    boolean encontrou = buscarNota(notas, notaBusca);
                    if (encontrou) {
                        System.out.println("A nota " + notaBusca + " foi encontrada no vetor.");
                    } else {
                        System.out.println("A nota " + notaBusca + " não foi encontrada no vetor.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }

    public static void preencherNotas(Scanner scanner, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
    }

    public static double encontrarMenorNota(double[] notas) {
        double menorNota = Double.MAX_VALUE;
        for (double nota : notas) {
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        return menorNota;
    }

    public static void imprimirNotas(double[] notas) {
        System.out.println("Notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }
    }

    public static double calcularSomaNotas(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma;
    }

    public static boolean buscarNota(double[] notas, double notaBusca) {
        for (double nota : notas) {
            if (nota == notaBusca) {
                return true;
            }
        }
        return false;
    }
}
