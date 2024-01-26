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

    public Pessoa(Pessoa pes) {
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
        VetorPessoa v = new VetorPessoa(10);

        v.leVetor();

        v.print();

        /*
         * 
         * Pessoa [nome=Pessoa0, idade=0, renda=0.0]
         * Pessoa [nome=Pessoa1, idade=2, renda=10000.0]
         * Pessoa [nome=Pessoa2, idade=4, renda=20000.0]
         * Pessoa [nome=Pessoa3, idade=6, renda=30000.0]
         * Pessoa [nome=Pessoa4, idade=8, renda=40000.0]
         * Pessoa [nome=Pessoa5, idade=10, renda=50000.0]
         * Pessoa [nome=Pessoa6, idade=12, renda=60000.0]
         * Pessoa [nome=Pessoa7, idade=14, renda=70000.0]
         * Pessoa [nome=Pessoa8, idade=16, renda=80000.0]
         * Pessoa [nome=Pessoa9, idade=18, renda=90000.0]
         */

        double media = v.rendaMedia();

        System.out.println("Média = " + media);
        // Média = 9000.0

        Pessoa pessoaBuscada = new Pessoa("Pessoa7", 14, 70000);

        if (v.busca(pessoaBuscada)) {
            System.out.println("Achouuuuuu!");
        }else{
            System.out.println("NÃO Achouuuuuu!");
        }
        //Achouuuuuu!

        if (v.busca(new Pessoa("JV", 25, 250000))) {
            System.out.println("Achouuuuuu!");
        }else{
            System.out.println("NÃO Achouuuuuu!");
        }
        //NÃO Achouuuuuu!

        int qtd = v.qtdMenorMedia(media);
        System.out.println("Quantidade menor que a média: " + qtd);
    }

}
