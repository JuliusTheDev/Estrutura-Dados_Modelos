import java.util.Scanner;

public class Lista2_Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] alturas = new double[10];
        double somaAlturas = 0;

        // Recebe as alturas dos atletas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a altura do atleta " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
            somaAlturas += alturas[i];
        }

        // Calcula a média das alturas
        double mediaAlturas = somaAlturas / 10;

        // Imprimi a média das alturas
        System.out.println("A altura média dos atletas é:"+ mediaAlturas);

    }
}