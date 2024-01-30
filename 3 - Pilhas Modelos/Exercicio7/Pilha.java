import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {
        Stack<Prato> pilha = new Stack<Prato>();

        pilha.push(new Prato("Lasanha", 20.00, "Lui", 13));
        pilha.push(new Prato("Carne", 10.00, "Luisa", 13));
        pilha.push(new Prato("Bobó", 5.00, "Luis", 13));
        pilha.push(new Prato("Sopa", 25.00, "Ama", 13));
        pilha.push(new Prato("Churrasco", 12.00, "Amare", 13));
        
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
    


  
    


