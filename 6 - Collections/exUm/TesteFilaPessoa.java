package exUm;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFilaPessoa {
    public static void main(String[] args) {
        Queue<Pessoa> filaPessoas = new LinkedList<>();

        // Adicionar 5 pessoas à fila
        filaPessoas.add(new Pessoa("Ivo", 50000.0, 1.75));
        filaPessoas.add(new Pessoa("Pecanha", 60000.0, 1.80));
        filaPessoas.add(new Pessoa("Lombo", 55000.0, 1.70));
        filaPessoas.add(new Pessoa("Xona", 70000.0, 1.90));
        filaPessoas.add(new Pessoa("Putz", 45000.0, 1.65));

        // Remover 3 pessoas da fila
        for (int i = 0; i < 3; i++) {
            Pessoa pessoaRemovida = filaPessoas.poll();
            if (pessoaRemovida != null) {
                System.out.println("Removida: " + pessoaRemovida.getNome());
            } else {
                System.out.println("Fila vazia.");
            }
        }

        // Testar a fila restante
        System.out.println("Pessoas restantes na fila:");
        for (Pessoa pessoa : filaPessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Salário: " + pessoa.getSalario() + ", Altura: "
                    + pessoa.getAltura());
        }
    }
}
