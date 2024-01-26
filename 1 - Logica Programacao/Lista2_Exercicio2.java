import java.util.Scanner;

public class Lista2_Exercicio2 {
    public static void main(String[] args) {
        int n = 198;  // Número de termos na série
        double S = 0.0;

        for (int i = 1; i <= n; i++) {
            double termo = (double) i / (7 + 6 * (i - 1));  // Fórmula para calcular o termo i
            S += termo;
        }

        System.out.println("O valor da série S é: " + S);
    }
}