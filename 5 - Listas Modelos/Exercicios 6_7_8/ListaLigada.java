
public class ListaLigada {

    private No primeiro, ultimo;

    public ListaLigada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public boolean listaVazia() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirInicio(Object elemento) {
        No novoNo = new No(elemento);
        if (listaVazia()) {
            this.ultimo = novoNo;
        } else {
            novoNo.setProx(primeiro);
        }
        this.primeiro = novoNo;
    }

    public void inserirFinal(Object elemento) {
        No novoNo = new No(elemento);
        if (listaVazia()) {
            this.primeiro = novoNo;
        } else {
            ultimo.setProx(novoNo);
        }
        this.ultimo = novoNo;
    }

    public int contarNos() {
        int tamanho = 0;
        No noTemp = this.primeiro;
        while (noTemp != null) {
            tamanho = tamanho + 1;
            noTemp = noTemp.getProx();
        }
        return tamanho;
    }

    public void inserirMeio(Object elemento, int posicao) {

        No noTemp = this.primeiro;
        int nroNos, posAux = 1;
        nroNos = this.contarNos();
        if (nroNos == 0 || posicao <= 1) {
            inserirInicio(elemento);
        } else {
            if (posicao > nroNos) {
                inserirFinal(elemento);
            } else {
                while (posAux < (posicao - 1)) {

                    noTemp = noTemp.getProx();
                    posAux = posAux + 1;
                }
                No novoNo = new No(elemento);
                novoNo.setProx(noTemp.getProx());
                noTemp.setProx(novoNo);
            }
        }
    }

    public void remover(Object elemento) {
        No noTemp = this.primeiro;
        No noAnt = null;
        if (this.primeiro.getElemento().equals(elemento)) {
            this.primeiro = primeiro.getProx();
        } else {
            while ((noTemp != null) && (!noTemp.getElemento().equals(elemento))) {
                noAnt = noTemp;
                noTemp = noTemp.getProx();
            }
            if (noTemp != null) {
                noAnt.setProx(noTemp.getProx());
            }
            if (noTemp == this.ultimo) {
                this.ultimo = noAnt;
            }
        }
    }

    public Object elementoInicio() {
        if (!listaVazia()) {
            return this.primeiro.getElemento();
        } else {
            return null;
        }
    }

    public Object elementoFinal() {
        if (!listaVazia()) {
            return this.ultimo.getElemento();
        } else {
            return null;
        }
    }

    public boolean buscaNo(Object elemento) {
        No noTemp = this.primeiro;
        boolean found = false;
        while (noTemp != null) {
            if (noTemp.getElemento().equals(elemento)) {
                return true;
            } else {
                noTemp = noTemp.getProx();
            }
        }
        return false;
    }

    public void mostrarLista() {
        int i = 1;
        No noTemp = this.primeiro;
        while (noTemp != null) {
            System.out.println("Elemento " + noTemp.getElemento() + " posição " + i);
            noTemp = noTemp.getProx();
            i++;
        }
    }

    public void destruir() {
        this.primeiro = null;
        this.ultimo = null;
    }


public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println("Lista Final Exercício 6:\n");

        lista.inserirInicio(new Integer(5));
        lista.inserirFinal(new Integer(7));
        lista.inserirMeio(new Integer(8), 2);
        lista.remover(new Integer(5));
        lista.inserirInicio(new Integer(3));
        lista.inserirInicio(new Integer(4));
        lista.remover(new Integer(7));
        lista.inserirFinal(new Integer(11));
        lista.inserirFinal(new Integer(20));
        lista.inserirMeio(new Integer(30), 3);
        lista.inserirMeio(new Integer(40), 2);
        lista.remover(new Integer(11));
        lista.remover(new Integer(20));
        lista.mostrarLista();
        System.out.println("\nNúmero de elementos: "+ lista.contarNos());
        lista.destruir();
        System.out.println("\nLista Final Exercício 7:\n");

        
        lista.inserirFinal(new Integer(7));
        lista.inserirFinal(new Integer(8));
        lista.inserirFinal(new Integer(3));
        lista.inserirFinal(new Integer(4));
        lista.remover(new Integer(7));
        lista.remover(new Integer(8));
        lista.destruir();
        lista.inserirFinal(new Integer(44));
        lista.inserirFinal(new Integer(555));
        lista.inserirFinal(new Integer(66));
        lista.inserirFinal(new Integer(77));
        lista.remover(new Integer(44));
        lista.remover(new Integer(555));
        lista.mostrarLista();
        System.out.println("\nNúmero de elementos: "+ lista.contarNos());
        lista.destruir();

        System.out.println("\nLista Final Exercício 8:\n");

        lista.inserirInicio(new Integer(51));
        lista.inserirInicio(new Integer(53));
        lista.inserirInicio(new Integer(54));
        lista.inserirInicio(new Integer(55));
        lista.remover(new Integer(55));
        lista.remover(new Integer(54));
        lista.inserirInicio(new Integer(33));
        lista.inserirInicio(new Integer(90));
        lista.remover(new Integer(90));
        lista.inserirInicio(new Integer(99));
        lista.remover(new Integer(99));
        lista.mostrarLista();
        System.out.println("\nNúmero de elementos: "+ lista.contarNos());
        lista.destruir();
    }

}
