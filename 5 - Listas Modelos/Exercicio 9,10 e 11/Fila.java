public class Fila extends ListaLigada {

    public Fila() {
        super();
    }

    public void enfileira(Object elemento) {
        inserirFinal(elemento);
    }

    public Object desenfileira() {
        return removerInicio();
    }

    public boolean filaVazia() {
        return listaVazia();
    }

    public Object frente() {
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
    Fila fila = new Fila();

fila.enfileira(new Integer(5));
fila.enfileira(new Integer(7));
fila.enfileira(new Integer(9));

System.out.println(fila.frente()); // 5
System.out.println(fila.desenfileira()); // 5
System.out.println(fila.desenfileira()); // 7
System.out.println(fila.desenfileira()); // 9

System.out.println(fila.filaVazia()); // true
}}
