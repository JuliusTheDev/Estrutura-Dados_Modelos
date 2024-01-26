
public class PilhaLinear {
//considere esta lista somente para número reais

    private double pilha[];
    private int t;
    private int tamanho;

    public PilhaLinear(int tamanho) {
        this.t = 0; // indica que esta nula, vazia
        this.tamanho = tamanho;
        this.pilha = new double[tamanho]; // criando uma pilha com tamanho informado pelo usuário
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.t == 0) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.t;
    }

    public double desempilhar() {
        //pop
        if (pilhaVazia()) {
            return -1;
        }
        return this.pilha[--this.t];
    }

    public void empilhar(double valor) {
        // push
        if (this.t < this.pilha.length) {
            this.pilha[t++] = valor;
        }
    }

    public double exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return -1;
        }
        return this.pilha[this.t - 1];
    }

    public static void main(String[] args) {
        //teste pilha

        PilhaLinear p = new PilhaLinear(5);
        p.empilhar(3.0);
        p.empilhar(-4.0);
        p.empilhar(2);  
        p.empilhar(0.5);
        p.empilhar(14);
        p.empilhar(88899);// pilha está cheia
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }

    }

}
