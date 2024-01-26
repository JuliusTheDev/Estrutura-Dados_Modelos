import java.util.Scanner;

public class Lista2_Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizC = new int[4][4];

        // Lê a matriz A
        System.out.println("Digite os valores da matriz A (4x4):");
        lerMatriz(scanner, matrizA);

        // Lê a matriz B
        System.out.println("Digite os valores da matriz B (4x4):");
        lerMatriz(scanner, matrizB);

        // Calcula a matriz C (soma de A e B)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibe a matriz C
        System.out.println("Matriz resultante C (A + B):");
        imprimirMatriz(matrizC);

        scanner.close();
    }

    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da posição (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
