package Sequencias;

public class Sequencias {
    public static void main(String[] args) {
        // a) 1, 3, 5, 7, ___
        int a = 9; // Próximo número é 9 (números ímpares)
        System.out.println("a) " + a);
        
        // b) 2, 4, 8, 16, 32, 64, ____
        int b = 128; // Próximo número é 128 (potências de 2)
        System.out.println("b) " + b);
        
        // c) 0, 1, 4, 9, 16, 25, 36, ____
        int c = 49; // Próximo número é 49 (quadrados perfeitos: 7^2)
        System.out.println("c) " + c);
        
        // d) 4, 16, 36, 64, ____
        int d = 100; // Próximo número é 100 (quadrados de números pares: 2^2, 4^2, 6^2, 8^2)
        System.out.println("d) " + d);
        
        // e) 1, 1, 2, 3, 5, 8, ____
        int e = 13; // Próximo número é 13 (sequência de Fibonacci)
        System.out.println("e) " + e);
        
        // f) 2, 10, 12, 16, 17, 18, 19, ____
        int f = 20; // Próximo número é 20 (sequência com números inteiros, pulando alguns)
        System.out.println("f) " + f);
    }
}
