package pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double renda;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double renda) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
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
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", renda=" + renda + "]";
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
        Pessoa other = (Pessoa) obj;
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
        Pessoa p = new Pessoa();

        // sem dados
        System.out.println(p);
        // Pessoa [nome=null, idade=0, renda=0.0]
        p.setIdade(10);
        p.setRenda(100);
        p.setNome("Juninho");
        System.out.println(p);
        // Pessoa [nome=Juninho, idade=10, renda=100.0]
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Renda: " + p.getRenda());
        /*
         * Nome: Juninho
         * Idade: 10
         * Renda: 100.0
         */

        Pessoa p2 = new Pessoa("Junior Pai", 40, 100);
        System.out.println(p2);

    }

}