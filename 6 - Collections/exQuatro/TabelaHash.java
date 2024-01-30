package exQuatro;

import java.util.Arrays;
import java.util.LinkedList;

public class TabelaHash {
    private LinkedList<Integer>[] tabela;
    private int tamanho;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new LinkedList[tamanho];
        Arrays.fill(tabela, new LinkedList<>());
    }

    private int calcularHash(int chave) {
        return chave % tamanho;
    }

    public void inserir(int chave, int valor) {
        int indice = Math.abs(calcularHash(chave));
        tabela[indice].add(valor);
    }

    public void remover(int chave, int valor) {
        int indice = Math.abs(calcularHash(chave));
        tabela[indice].removeFirstOccurrence(valor);
    }

    public boolean buscar(int chave, int valor) {
        int indice = Math.abs(calcularHash(chave));
        return tabela[indice].contains(valor);
    }
}