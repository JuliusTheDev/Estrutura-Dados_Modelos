package Exercicio6;

public class VetorPrato {
    private Prato p[];
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public VetorPrato(int size) {
        this.size = size;
        this.p = new Prato[this.size];
    }

    public void leVetor() {
        for (int i = 0; i < p.length; i++) {
            this.p[i] = new Prato("Prato" + i, i * 2, i * 10000);
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

    public boolean busca(Prato pes) {
        for (int i = 0; i < p.length; i++) {
            if (p[i].equals(pes)) {
                return true;
            }
        }
        return false;
    }

    public int qtdMenorMedia(double media) {
        int cont = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getRenda() < media) {
                cont++;
            }
        }
        return cont;
    }

}