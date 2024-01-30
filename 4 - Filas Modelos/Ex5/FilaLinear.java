package Ex5;

public class FilaLinear {

    private Prato[] fila;
    private int quantidade;
    private int inicio;
    private int fim;

    // Construtor usado para da instanciação da FILA.
    public FilaLinear(int tamanhoFila) {
        fila = new Prato[tamanhoFila];
        quantidade = 0;
        inicio = -1;
        fim = -1;
    }

    public boolean isEmpty() {
        // se inicio == -1 então está vazia, esta forma verifica e retorna o valor
        // booleano da operação.
        return inicio == -1;
    }

    public boolean isFull() {
        return fim == fila.length - 1;
    }

    public int size() {
        return quantidade;
    }

    public void enqueue(Prato valor) {

        // Se está vazia
        if (isEmpty()) {
            inicio++;
            fim++;
            fila[inicio] = valor;
            quantidade++;
        } else {
            if (!isFull()) { // Se não estiver cheia
                fim++;
                fila[fim] = valor;
                quantidade++;
            } else {
                System.out.println("Fila Cheia: overflow");
            }
        }
    }

    public Prato dequeue() {

        if (isEmpty()) {
            System.out.println("Fila Vazia");
            return null;
        } else {
            // Obtendo o primeiro da fila para que seja retornado.
            Prato valorRetorno = fila[inicio];
            // inicio == fim => há apenas 1 valor na fila, também pode ser quantidade == 1;
            if (inicio == fim) {
                // Se há apenas um elemento na fila zerar tudo.
                inicio = -1;
                fim = -1;
                quantidade--;
            } else {
                // Caso contrário incrementar o valor da variável inicio e reorganizar a fila
                // (trazer o segundo para o primeiro e assim por diante)
                inicio++;
                Reorganizar();
            }
            return valorRetorno;
        }

    }

    // Este método implementa a reorganização do vetor após um DEQUEUE
    private void Reorganizar() {
        for (int i = inicio; i <= fim; i++) {
            fila[i - 1] = fila[i];
        }
        // Como todos os valores foram uma casa para a esquerda, os ponteiros também
        // devem ser corrigidos.
        inicio--;
        fim--;
    }

    // Método extra para exibir o estado da fila;
    public void ExibirFila() {
        if (!isEmpty()) {
            for (int i = inicio; i <= fim; i++) {
                System.out.print(fila[i] + " ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        System.out.println("Fila");

        FilaLinear fila = new FilaLinear(6);

        fila.enqueue(new Prato("Strogonoff", 50, "Claudia Raia"));
        fila.ExibirFila();

        fila.enqueue(new Prato("Feijoada", 40, "Pedro Sampaio"));
        fila.ExibirFila();
        fila.enqueue(new Prato("Panqueca", 25, "João Júnior"));
        fila.ExibirFila();
        fila.enqueue(new Prato("Arroz com ovo", 10, "Felipe Carvalho"));
        fila.ExibirFila();
        fila.enqueue(new Prato("Macarrão alho e oléo", 15, "Lorenzo"));
        fila.enqueue(new Prato("Lasanha", 45, "Leandrinha"));
        fila.enqueue(new Prato("Frango assado", 30, "Julia Campare"));
        fila.enqueue(new Prato("Espetinho completo", 20, "Josuel"));
        fila.ExibirFila();
        fila.enqueue(new Prato("Girrafa assada", 72, "Pigvaldo")); // overflow
        fila.ExibirFila();

    }

}
