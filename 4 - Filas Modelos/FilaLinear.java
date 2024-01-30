
public class FilaLinear {

    private double[] fila;
    private int quantidade;
    private int inicio;
    private int fim;

    // Construtor usado para da instanciação da FILA.
    public FilaLinear(int tamanhoFila) {
        fila = new double[tamanhoFila];
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

    public void enqueue(double valor) {

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

    public double dequeue() {

        if (isEmpty()) {
            System.out.println("Fila Vazia");
            return -1;
        } else {
            // Obtendo o primeiro da fila para que seja retornado.
            double valorRetorno = fila[inicio];
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

        fila.enqueue(10.0);
        fila.ExibirFila();

        fila.dequeue(); // sai o 10;
        fila.ExibirFila();

        fila.enqueue(103.0);
        fila.ExibirFila();
        fila.enqueue(120.0);
        fila.ExibirFila();
        fila.enqueue(150.0);
        fila.ExibirFila();
        fila.dequeue(); // sai o 103;
        fila.enqueue(110.0);
        fila.enqueue(160.5);
        fila.enqueue(170.0);
        fila.enqueue(180.0);
        fila.ExibirFila();
        fila.enqueue(190.5); // overflow
        fila.ExibirFila();

    }

}
