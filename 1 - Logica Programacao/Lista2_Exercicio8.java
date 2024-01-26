import java.util.Scanner;

public class Lista2_Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizM = new int[5][5];

        // Lê a matriz M
        System.out.println("Digite os valores da matriz M (5x5):");
        lerMatriz(scanner, matrizM);

        // Calcula as somas solicitadas
        int somaLinha4 = calcularSomaLinha(matrizM, 3);
        int somaColuna2 = calcularSomaColuna(matrizM, 1);
        int somaDiagonalPrincipal = calcularSomaDiagonalPrincipal(matrizM);
        int somaDiagonalSecundaria = calcularSomaDiagonalSecundaria(matrizM);
        int somaTotal = calcularSomaTotal(matrizM);

        // Exibe as somas e a matriz
        System.out.println("Soma da linha 4: " + somaLinha4);
        System.out.println("Soma da coluna 2: " + somaColuna2);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
        System.out.println("Soma total: " + somaTotal);

        System.out.println("Matriz M:");
        imprimirMatriz(matrizM);

        scanner.close();
    }

    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor da posição (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int calcularSomaLinha(int[][] matriz, int linha) {
        int soma = 0;
        for (int j = 0; j < 5; j++) {
            soma += matriz[linha][j];
        }
        return soma;
    }

    public static int calcularSomaColuna(int[][] matriz, int coluna) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][coluna];
        }
        return soma;
    }

    public static int calcularSomaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public static int calcularSomaDiagonalSecundaria(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][4 - i];
        }
        return soma;
    }

    public static int calcularSomaTotal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
