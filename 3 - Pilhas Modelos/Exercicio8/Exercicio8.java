import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();
        
        String[] palavras = texto.split(" ");

        Stack<Character> pilha = new Stack<>();
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            for (char letra : palavra.toCharArray()) {
                pilha.push(letra);
            }

            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }

            resultado.append(" ");
        }

        String saida = resultado.toString().trim();
        System.out.println(saida);
    }
}