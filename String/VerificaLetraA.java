package String; 

import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine(); 

        int contador = 0; // Variável para contar o número de ocorrências de 'a' ou 'A'

        // Percorrer a string e verificar a existência de 'a' ou 'A'
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i); // Pega cada caractere da string

            // Verifica se o caractere é 'a' ou 'A'
            if (caractere == 'a' || caractere == 'A') {
                contador++; 
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' aparece " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' ou 'A' não aparece na string.");
        }

        scanner.close(); 
    }
}
