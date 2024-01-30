package ex6;

public class FilaInteiros {
	private int[] elementos;
	private int tamanho;
	private int capacidade;
	private int inicio;
	private int fim;

	public FilaInteiros(int capacidade) {
    		this.capacidade = capacidade;
    		this.elementos = new int[capacidade];
    		this.tamanho = 0;
    		this.inicio = 0;
    		this.fim = -1;
	}

	public boolean isEmpty() {
    		return tamanho == 0;
	}

	public boolean isFull() {
    		return tamanho == capacidade;
	}

	public int size() {
    		return tamanho;
	}

	public void enqueue(int elemento) {
    		if (!isFull()) {
        		fim = (fim + 1) % capacidade;
        		elementos[fim] = elemento;
        		tamanho++;
    		} else {
        		System.out.println("A fila está cheia. Não é possível adicionar elementos.");
    		}
	}

	public int dequeue() {
    		if (!isEmpty()) {
        		int elementoRemovido = elementos[inicio];
        		inicio = (inicio + 1) % capacidade;
        		tamanho--;
        		return elementoRemovido;
    		} else {
        		System.out.println("A fila está vazia. Não é possível remover elementos.");
        		return -1; 
    		}
	}

	public static FilaInteiros concatenaFilas(FilaInteiros fila1, FilaInteiros fila2) {
    		FilaInteiros filaConcatenada = new FilaInteiros(fila1.capacidade + fila2.capacidade);

    		while (!fila1.isEmpty()) {
        			filaConcatenada.enqueue(fila1.dequeue());
    		}

    		while (!fila2.isEmpty()) {
        			filaConcatenada.enqueue(fila2.dequeue());
    		}

    		return filaConcatenada;
	}

	public static void main(String[] args) {
    		FilaInteiros F1 = new FilaInteiros(6);
    		FilaInteiros F2 = new FilaInteiros(6);

        F1.enqueue(14);
        F1.enqueue(21);
        F1.ExibirFila();


        F1.dequeue();


        F1.enqueue(28);
        F1.ExibirFila();


        F1.dequeue();
        F1.ExibirFila();


        F1.enqueue(35);
        F1.enqueue(42);
        F1.enqueue(49);
        F1.enqueue(56);
        //overflow
        F1.enqueue(63);
        F1.ExibirFila();


        F1.dequeue();
        F1.ExibirFila();

        
        F2.enqueue(2);
        F2.enqueue(12);
        F2.ExibirFila();


        F2.dequeue();


        F2.enqueue(45);
        F2.ExibirFila();


        F2.dequeue();
        F2.ExibirFila();


        F2.enqueue(5);
        F2.enqueue(4);
        F2.enqueue(78);
        F2.enqueue(22);
        //overflow
        F2.enqueue(56);
        F2.ExibirFila();


        F2.dequeue();
        F2.ExibirFila();

    		FilaInteiros F3 = concatenaFilas(F1, F2);

    		System.out.print("F3 (fila concatenada): ");
    		while (!F3.isEmpty()) {
        			System.out.print(F3.dequeue() + " ");
    		}
    		System.out.println();

    		
    		System.out.println("F1 está vazia: " + F1.isEmpty());
    		System.out.println("F2 está vazia: " + F2.isEmpty());
		}

	private void ExibirFila() {
		
		
	}
}
	
	
	
	
	

