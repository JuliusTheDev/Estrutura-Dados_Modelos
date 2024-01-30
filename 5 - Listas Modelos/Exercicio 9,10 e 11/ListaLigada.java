
public class ListaLigada {

    private No ultimo;
    public No primeiro;

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

    public Object removerInicio() {
        if (listaVazia()) {
            return null;
        }
    
        Object valor = primeiro.getElemento();
        primeiro = primeiro.getProx();
    
        if (primeiro == null) {
            ultimo = null;
        }
    
        return valor;
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

        System.out.println("Lista com Inserção no Início");

        lista.inserirInicio(new Integer(3));
        lista.inserirInicio(new Integer(5));
        lista.inserirInicio(new Integer(7));
        lista.inserirInicio(new Integer(10));
        lista.mostrarLista();

        System.out.println("\nBusca");
        System.out.println(lista.buscaNo(new Integer(10)));
        System.out.println(lista.buscaNo(new Integer(1000)));

        System.out.println("\nElemento do Início: " + lista.elementoInicio());
        System.out.println("Elemento do Final: " + lista.elementoFinal());
        
        System.out.println("\nNúmero de elementos: "+ lista.contarNos());

        lista.remover(new Integer(3));
        System.out.println("\nApós Remoção do 3");
        lista.mostrarLista();

        lista.remover(new Integer(5));
        lista.remover(new Integer(7));
        lista.remover(new Integer(10));
        System.out.println("Após Remoção de todos");
        lista.mostrarLista();
        
        
        //destruir
        
         System.out.println("\n\nTeste destruir");
        lista.inserirInicio(new Integer(3));
        lista.inserirInicio(new Integer(5));
        lista.inserirInicio(new Integer(7));
        lista.inserirInicio(new Integer(10));
        lista.mostrarLista();
        lista.destruir();
        System.out.println("\nApós Destruição");
        lista.mostrarLista();
        

  
        System.out.println("\n\nLista com Inserção no Final");

        lista.inserirFinal(new Integer(3));
        lista.inserirFinal(new Integer(5));
        lista.inserirFinal(new Integer(7));
        lista.inserirFinal(new Integer(10));
        lista.mostrarLista();

        lista.remover(new Integer(3));
        System.out.println("Após Remoção do 3");
        lista.mostrarLista();

        lista.remover(new Integer(5));
        lista.remover(new Integer(7));
        lista.remover(new Integer(10));
        System.out.println("Após Remoção de todos");
        lista.mostrarLista();

      
        System.out.println("\n\nLista com Inserção no Meio");

        lista.inserirMeio(new Integer(3), 1);
        lista.inserirMeio(new Integer(5), 2);
        lista.inserirMeio(new Integer(10), 2);
        lista.inserirMeio(new Integer(7), 1);
        lista.inserirMeio(new Integer(77), 3);
        lista.mostrarLista();

        lista.remover(new Integer(77));
        System.out.println("Após Remoção do 77");
        lista.mostrarLista();
        lista.remover(new Integer(5));
        lista.remover(new Integer(7));
        lista.remover(new Integer(10));
        lista.remover(new Integer(3));
        System.out.println("Após Remoção de todos");
        lista.mostrarLista();

    }

}
