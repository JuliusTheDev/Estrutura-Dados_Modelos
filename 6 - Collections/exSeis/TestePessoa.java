import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import exSeis.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        // Criando um HashSet de Pessoas
        HashSet<Pessoa> hashSet = new HashSet<>();

        // Adicionando pessoas ao HashSet
        hashSet.add(new Pessoa("João"));
        hashSet.add(new Pessoa("Maria"));
        hashSet.add(new Pessoa("Pedro"));
        hashSet.add(new Pessoa("Ana"));
        hashSet.add(new Pessoa("Carlos"));

        // Removendo uma pessoa do HashSet
        hashSet.remove(new Pessoa("Pedro"));

        // Verificando se uma pessoa está no HashSet
        boolean containsPessoa = hashSet.contains(new Pessoa("Maria"));
        System.out.println("HashSet contém Maria? " + containsPessoa);

        // Limpando o HashSet
        hashSet.clear();

        System.out.println("-------------------------");

        // Criando um TreeSet de Pessoas
        TreeSet<Pessoa> treeSet = new TreeSet<>();

        // Adicionando pessoas ao TreeSet
        treeSet.add(new Pessoa("João"));
        treeSet.add(new Pessoa("Maria"));
        treeSet.add(new Pessoa("Pedro"));
        treeSet.add(new Pessoa("Ana"));
        treeSet.add(new Pessoa("Carlos"));

        // Removendo uma pessoa do TreeSet
        treeSet.remove(new Pessoa("Pedro"));

        // Verificando se uma pessoa está no TreeSet
        boolean containsPessoa2 = treeSet.contains(new Pessoa("Maria"));
        System.out.println("TreeSet contém Maria? " + containsPessoa2);

        // Limpando o TreeSet
        treeSet.clear();

        System.out.println("-------------------------");

         // Criando um LinkedHashSet de Pessoas
        LinkedHashSet<Pessoa> linkedHashSet = new LinkedHashSet<>();

        // Adicionando pessoas ao LinkedHashSet
        linkedHashSet.add(new Pessoa("João"));
        linkedHashSet.add(new Pessoa("Maria"));
        linkedHashSet.add(new Pessoa("Pedro"));
        linkedHashSet.add(new Pessoa("Ana"));
        linkedHashSet.add(new Pessoa("Carlos"));

        // Removendo uma pessoa do LinkedHashSet
        linkedHashSet.remove(new Pessoa("Pedro"));

        // Verificando se uma pessoa está no LinkedHashSet
        boolean containsPessoa3 = linkedHashSet.contains(new Pessoa("Maria"));
        System.out.println("LinkedHashSet contém Maria? " + containsPessoa3);

        // Limpando o LinkedHashSet
        linkedHashSet.clear();
    }
}
