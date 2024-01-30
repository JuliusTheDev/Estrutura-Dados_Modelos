package numeroUm;

import java.util.Arrays;
import java.util.Random;

public class VetorOperacoes {
    private int[] vetor;

    public VetorOperacoes(int tamanho) {
        this.vetor = new int[tamanho];
        preencherVetorAleatorio();
    }

    private void preencherVetorAleatorio() {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); // Preenche o vetor com números aleatórios de 0 a 99
        }
    }

    public void imprimirVetor() {
        System.out.println(Arrays.toString(vetor));
    }

    public boolean buscaSequencial(int elemento) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                System.out.println("Elemento encontrado na posição " + i);
                return true;
            }
        }
        System.out.println("Elemento não encontrado no vetor.");
        return false;
    }

    public boolean buscaBinaria(int elemento) {
        Arrays.sort(vetor); // Garante que o vetor está ordenado para a busca binária
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == elemento) {
                System.out.println("Elemento encontrado na posição " + meio);
                return true;
            } else if (vetor[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        System.out.println("Elemento não encontrado no vetor.");
        return false;
    }
}
