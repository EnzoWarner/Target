package Interruptores;

public class Interruptores {
    public static void main(String[] args) {
        // Simulando a identificação dos interruptores
        String[] lampadas = new String[3]; // Array para as lâmpadas
        lampadas[0] = "desligada"; // Lâmpada 1
        lampadas[1] = "desligada"; // Lâmpada 2
        lampadas[2] = "desligada"; // Lâmpada 3

        // Ações com os interruptores
        System.out.println("Ligando o primeiro interruptor por 5 minutos...");
        lampadas[0] = "ligada"; // Lâmpada 1 está ligada
        // Após 5 minutos, desligar o primeiro interruptor e ligar o segundo
        System.out.println("Desligando o primeiro interruptor e ligando o segundo...");
        lampadas[1] = "ligada"; // Lâmpada 2 está ligada

        // Simulação da ida à sala
        System.out.println("Indo até a sala para verificar as lâmpadas...");

        // Verificando lâmpadas
        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i].equals("ligada")) {
                System.out.println("A lâmpada " + (i + 1) + " está acesa.");
            } else {
                System.out.println("A lâmpada " + (i + 1) + " está apagada.");
            }
        }

        // Resultados da verificação (neste exemplo, a lógica real de temperatura não é simulada)
        System.out.println("A lâmpada acesa é controlada pelo segundo interruptor.");
        System.out.println("A lâmpada apagada e quente é controlada pelo primeiro interruptor.");
        System.out.println("A lâmpada apagada e fria é controlada pelo terceiro interruptor.");
    }
}

