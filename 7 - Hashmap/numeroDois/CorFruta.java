package numeroDois;

import java.util.HashMap;
import java.util.Scanner;

public class CorFruta {

    private static HashMap<String, String> mapa = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1- Cadastrar Cor/Fruta");
            System.out.println("2 – Imprimir todos os dados");
            System.out.println("3 – Quantidade de dados");
            System.out.println("4 – Buscar o nome da fruta a partir da cor.");
            System.out.println("5 – Remover uma cor/fruta");
            System.out.println("0 – Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarCorFruta(scanner);
                    break;
                case 2:
                    imprimirDados();
                    break;
                case 3:
                    quantidadeDados();
                    break;
                case 4:
                    buscarFrutaPelaCor(scanner);
                    break;
                case 5:
                    removerCorFruta(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarCorFruta(Scanner scanner) {
        System.out.print("Cor: ");
        String cor = scanner.next();
        System.out.print("Fruta: ");
        String fruta = scanner.next();

        mapa.put(cor, fruta);
        System.out.println("Cor/Fruta cadastrada com sucesso!");
    }

    private static void imprimirDados() {
        System.out.println("Cor | Fruta");
        for (String cor : mapa.keySet()) {
            System.out.println(cor + " | " + mapa.get(cor));
        }
    }

    private static void quantidadeDados() {
        System.out.println("Quantidade de dados: " + mapa.size());
    }

    private static void buscarFrutaPelaCor(Scanner scanner) {
        System.out.print("Cor: ");
        String cor = scanner.next();

        if (mapa.containsKey(cor)) {
            System.out.println("Fruta: " + mapa.get(cor));
        } else {
            System.out.println("Cor não encontrada!");
        }
    }

    private static void removerCorFruta(Scanner scanner) {
        System.out.print("Cor: ");
        String cor = scanner.next();

        if (mapa.containsKey(cor)) {
            mapa.remove(cor);
            System.out.println("Cor/Fruta removida com sucesso!");
        } else {
            System.out.println("Cor não encontrada!");
        }
    }
}

