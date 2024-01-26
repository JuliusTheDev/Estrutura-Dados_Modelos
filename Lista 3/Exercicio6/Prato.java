package Exercicio6;

public class Prato {
    private String nome;
    private int idade;
    private double renda;

    public Prato() {
    }

    public Prato(String nome, int idade, double renda) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }

    public Prato(Prato pes) {
        this.nome = pes.nome;
        this.idade = pes.idade;
        this.renda = pes.renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Prato [nome=" + nome + ", idade=" + idade + ", renda=" + renda + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + idade;
        long temp;
        temp = Double.doubleToLongBits(renda);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prato other = (Prato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idade != other.idade)
            return false;
        if (Double.doubleToLongBits(renda) != Double.doubleToLongBits(other.renda))
            return false;
        return true;
    }

    public static void main(String[] args) {
        VetorPrato v = new VetorPrato(10);

        v.leVetor();

        v.print();

        double media = v.rendaMedia();

        System.out.println("Média = " + media);
        // Média = 9000.0

        Prato pessoaBuscada = new Prato("Pessoa7", 14, 70000);

        if (v.busca(pessoaBuscada)) {
            System.out.println("Achouuuuuu!");
        } else {
            System.out.println("NÃO Achouuuuuu!");
        }
        // Achouuuuuu!

        if (v.busca(new Prato("JV", 25, 250000))) {
            System.out.println("Achouuuuuu!");
        } else {
            System.out.println("NÃO Achouuuuuu!");
        }
        // NÃO Achouuuuuu!

        int qtd = v.qtdMenorMedia(media);
        System.out.println("Quantidade menor que a média: " + qtd);
    }
}
