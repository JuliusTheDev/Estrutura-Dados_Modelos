public class Pilha extends ListaLigada {

    public Pilha() {
        super();
    }

    public void empilha(Object elemento) {
        inserirInicio(elemento);
    }

    public Object desempilha() {
        return removerInicio();
    }

    public boolean pilhaVazia() {
        return listaVazia();
    }

    public Object topo() {
        if (!listaVazia()) {
            return primeiro.getElemento();
        } else {
            return null;
        }
    }

    public void mostrar() {
        No noTemp = this.primeiro;
        while (noTemp != null) {
            System.out.println(noTemp.getElemento());
            noTemp = noTemp.getProx();
        }
    }


public static void main(String[] args) {
    Pilha pilha = new Pilha();

pilha.empilha(new Integer(5));
pilha.empilha(new Integer(7));
pilha.empilha(new Integer(9));

pilha.mostrar(); // 9 7 5
} }