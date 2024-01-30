import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Adicione 5 pessoas
        pessoas.add(new Pessoa("João", 2000, 1.75));
        pessoas.add(new Pessoa("Maria", 3000, 1.65));
        pessoas.add(new Pessoa("Pedro", 2500, 1.80));
        pessoas.add(new Pessoa("Ana", 3500, 1.70));
        pessoas.add(new Pessoa("Carlos", 1800, 1.90));

        // Apresente os dados do ArrayList
        System.out.println("ArrayList original:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Salário: " + pessoa.getSalario() + ", Altura: " + pessoa.getAltura());
        }

        // Ordene de forma crescente o ArrayList
        Collections.sort(pessoas);

        // Apresente os dados do ArrayList ordenado
        System.out.println("\nArrayList ordenado (crescente):");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Salário: " + pessoa.getSalario() + ", Altura: " + pessoa.getAltura());
        }

        // Ordene o ArrayList de forma decrescente
        Collections.sort(pessoas, Collections.reverseOrder());

        // Apresente os dados do ArrayList ordenado de forma decrescente
        System.out.println("\nArrayList ordenado (decrescente):");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Salário: " + pessoa.getSalario() + ", Altura: " + pessoa.getAltura());
        }

        // Ordene de forma crescente o ArrayList usando um comparador externo
        Collections.sort(pessoas, new CompararPessoa());

        // Apresente os dados do ArrayList ordenado usando o comparador externo
        System.out.println("\nArrayList ordenado usando comparador externo:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Salário: " + pessoa.getSalario() + ", Altura: " + pessoa.getAltura());
        }
    }
}