
import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {
        Stack<Double> pilha = new Stack<>();

        pilha.push(3.0);
        pilha.push(-4.0);
        pilha.push(2.0);
        pilha.push(1.5);
        pilha.push(99.0);
        pilha.push(88899.0);
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
    


  
    


