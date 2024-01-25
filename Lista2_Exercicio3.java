import java.util.Scanner;

public class Lista2_Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int ate10 = 0, de11a20 = 0, de21a30 = 0, acima30 = 0;

        System.out.println("Digite a idade das pessoas (digite um valor negativo para encerrar):");

        while (true) {
            idade = scanner.nextInt();

            if (idade < 0) {
                break;
            } else if (idade <= 10) {
                ate10++;
            } else if (idade <= 20) {
                de11a20++;
            } else if (idade <= 30) {
                de21a30++;
            } else {
                acima30++;
            }
        }

        System.out.println("Quantidade de pessoas por faixa etária:");
        System.out.println("Até 10 anos: " + ate10);
        System.out.println("De 11 a 20 anos: " + de11a20);
        System.out.println("De 21 a 30 anos: " + de21a30);
        System.out.println("Acima de 30 anos: " + acima30);

        scanner.close();
    }
}
