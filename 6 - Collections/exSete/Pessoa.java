import java.util.Comparator;

class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int salario;
    private double altura;

    public Pessoa(String nome, int salario, double altura) {
        this.nome = nome;
        this.salario = salario;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
    }
}

class CompararPessoa implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return pessoa1.getSalario() - pessoa2.getSalario();
    }
}
