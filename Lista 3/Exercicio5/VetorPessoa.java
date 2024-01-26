public class VetorPessoa {
    private Pessoa p[];
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public VetorPessoa(int size) {
        this.size = size;
        this.p = new Pessoa[this.size];
    }

    public void leVetor() {
        for (int i = 0; i < p.length; i++) {
            this.p[i] = new Pessoa("Pessoa" + i, i * 2, i * 10000);
        }
    }

    public void print() {
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public double rendaMedia() {
        double soma = 0;
        for (int i = 0; i < p.length; i++) {
            soma = p[i].getRenda();
        }
        double media = soma / p.length;

        return media;
    }

    public boolean busca(Pessoa pes) {
        for (int i = 0; i < p.length; i++) {
            if (p[i].equals(pes)) {
                return true;
            }
        }
        return false;
    }

    public int qtdMenorMedia(double media){
        int cont = 0;
        for (int i = 0; i < p.length; i++) {
            if(p[i].getRenda() < media){
                cont++;
            }
        }
        return cont;
    }



}
