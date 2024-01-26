import java.util.Scanner;

public class Lista2_Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAtletas = 10;
        double[] alturaAtletas = new double[totalAtletas];

        for (int i = 0; i < totalAtletas; i++) {
            System.out.print("Digite a altura do atleta " + (i+1) + " em metros: ");
            alturaAtletas[i] = scanner.nextDouble();
        }

        double somaAlturas = 0;
        for (double altura : alturaAtletas) {
            somaAlturas += altura;
        }
        double mediaAltura = somaAlturas / totalAtletas;

        int abaixoDaMedia = 0;
        for (double altura : alturaAtletas) {
            if (altura < mediaAltura) {
                abaixoDaMedia++;
            }
        }

        System.out.printf("A altura média dos atletas é: %.2f metros%n", mediaAltura);
        System.out.println("A quantidade de atletas com altura abaixo da média é: " + abaixoDaMedia);

        scanner.close();
    }
}
