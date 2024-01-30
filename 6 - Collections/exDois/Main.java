package exDois;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Crie três filas (F1, F2, F3) com 5 elementos cada uma
        Queue<Integer> F1 = new LinkedList<>();
        Queue<Integer> F2 = new LinkedList<>();
        Queue<Integer> F3 = new LinkedList<>();

        // Adicione elementos às filas F1, F2 e F3
        for (int i = 1; i <= 5; i++) {
            F1.offer(i * 2); // Números pares
            F2.offer(i * 2 + 1); // Números ímpares
            F3.offer(i * 3); // Outros números
        }

        // Concatene as três filas em uma quarta fila (F4)
        Queue<Integer> F4 = new LinkedList<>();
        F4.addAll(F1);
        F4.addAll(F2);
        F4.addAll(F3);

        // Crie duas pilhas para números pares e ímpares a partir de F4
        Stack<Integer> pilhaPares = new Stack<>();
        Stack<Integer> pilhaImpares = new Stack<>();

        while (!F4.isEmpty()) {
            int elemento = F4.poll();
            if (elemento % 2 == 0) {
                pilhaPares.push(elemento);
            } else {
                pilhaImpares.push(elemento);
            }
        }

        // Apresente as pilhas resultantes retirando sempre o elemento do topo da pilha
        System.out.println("Pilha de Números Pares:");
        while (!pilhaPares.isEmpty()) {
            System.out.println("Topo: " + pilhaPares.pop());
        }

        System.out.println("Pilha de Números Ímpares:");
        while (!pilhaImpares.isEmpty()) {
            System.out.println("Topo: " + pilhaImpares.pop());
        }
    }
}

