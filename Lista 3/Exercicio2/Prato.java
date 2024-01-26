package Exercicio2;

public class Prato {
    private String nomePrato;
    private double preco;
    private String nomeChefe;

    public Prato() {
    }

    public Prato(String nomePrato, double preco, String nomeChefe) {
        this.nomePrato = nomePrato;
        this.preco = preco;
        this.nomeChefe = nomeChefe;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeChefe() {
        return nomeChefe;
    }

    public void setNomeChefe(String nomeChefe) {
        this.nomeChefe = nomeChefe;
    }

    @Override
    public String toString() {
        return "Prato [nomePrato=" + nomePrato + ", preco=" + preco + ", nomeChefe=" + nomeChefe + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomePrato == null) ? 0 : nomePrato.hashCode());
        long temp;
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((nomeChefe == null) ? 0 : nomeChefe.hashCode());
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
        if (nomePrato == null) {
            if (other.nomePrato != null)
                return false;
        } else if (!nomePrato.equals(other.nomePrato))
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        if (nomeChefe == null) {
            if (other.nomeChefe != null)
                return false;
        } else if (!nomeChefe.equals(other.nomeChefe))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Prato p = new Prato();

        // sem dados
        System.out.println(p);
        // Pessoa [nome=null, idade=0, renda=0.0]
        p.setNomeChefe("Jason");
        p.setPreco(1000);
        p.setNomePrato("Carne Moida");
        System.out.println(p);
        // Pessoa [nome=Juninho, idade=10, renda=100.0]
        System.out.println("Nome do Prato: " + p.getNomePrato());
        System.out.println("Preco: " + p.getPreco());
        System.out.println("Nome do Chefe: " + p.getNomeChefe());

        Prato p2 = new Prato("Rango", 250, "Popo");
        System.out.println(p2);

    }

}