package numeroUm;

public class Main {
public static void main(String[] args) {
        int tamanho = 10; // Tamanho do vetor

        VetorOperacoes vetorOperacoes = new VetorOperacoes(tamanho);

        System.out.println("Vetor original:");
        vetorOperacoes.imprimirVetor();

        int elementoBusca = 42; // Elemento que será buscado no vetor

        System.out.println("\nBusca sequencial:");
        vetorOperacoes.buscaSequencial(elementoBusca);

        System.out.println("\nBusca binária:");
        vetorOperacoes.buscaBinaria(elementoBusca);
        }
}

