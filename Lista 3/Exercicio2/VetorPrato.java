package Exercicio2;

public class VetorPrato {
    private Prato p[];
    private int size;

    public Prato[] getP() {
        return p;
    }

    public void setP(Prato[] p) {
        this.p = p;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public VetorPrato(int size) {

        this.size = size;
        p = new Prato[size];
    }

    public void leVetor() {
        for (int i = 0; i < p.length; i++) {
            this.p[i] = new Prato("Prato" + i, i * 2, "Chefe");
        }
    }

    public void print() {
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }
}