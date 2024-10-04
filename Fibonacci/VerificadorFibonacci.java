import java.util.Scanner;

public class VerificadorFibonacci {

    // Método para verificar se o número faz parte da sequência de Fibonacci
    public static boolean pertenceFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true; // 0 e 1 fazem parte da sequência
        }
        
        int anterior = 0, atual = 1, proximo = 0;
        
        // Gera a sequência de Fibonacci até atingir ou ultrapassar o número informado
        while (proximo < numero) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        
        // Se o número informado for igual ao valor gerado pela sequência, ele pertence à sequência
        return proximo == numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}
