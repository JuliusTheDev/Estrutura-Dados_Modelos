
public class PilhaLinear {
//considere esta lista somente para número reais

    private Prato pilha[];
    private int t;
    private int tamanho;

    public PilhaLinear(int tamanho) {
        this.t = 0; // indica que esta nula, vazia
        this.tamanho = tamanho;
        this.pilha = new Prato[tamanho]; // criando uma pilha com tamanho informado pelo usuário
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

    public Prato desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[--this.t];
    }

    public void empilhar(Prato valor) {
        // push
        if (this.t < this.pilha.length) {
            this.pilha[t++] = valor;
        }
    }

    public Prato exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.t - 1];
    }

    public static void main(String[] args) {
        //teste pilha

        PilhaLinear p = new PilhaLinear(5);
        Prato pr = new Prato();
        Prato pr1 = new Prato();
        Prato pr2 = new Prato();
        Prato pr3 = new Prato();
        Prato pr4 = new Prato();


        p.empilhar(pr);
        p.empilhar(pr1);
        p.empilhar(pr2);
        p.empilhar(pr3);
        p.empilhar(pr4);
        // pilha está cheia
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }

    }

}
