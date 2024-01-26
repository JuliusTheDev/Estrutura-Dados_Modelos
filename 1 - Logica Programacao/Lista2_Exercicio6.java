import java.util.Scanner;

public class Lista2_Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ocorrencias = new int[6]; // Para contar as ocorrências de 1 a 6

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o resultado do lançamento " + (i + 1) + ": ");
            int resultado = scanner.nextInt();
            if (resultado >= 1 && resultado <= 6) {
                ocorrencias[resultado - 1]++;
            } else {
                System.out.println("Resultado inválido. Insira um valor entre 1 e 6.");
                i--; // Para repetir a entrada inválida
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("O número " + (i + 1) + " ocorreu " + ocorrencias[i] + " vezes.");
        }

        scanner.close();
    }
}
