package exUm;

public class Pessoa {
    private String nome;
    private double salario;
    private double altura;

    public Pessoa(String nome, double salario, double altura) {
        this.nome = nome;
        this.salario = salario;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getAltura() {
        return altura;
    }
}
