package br.com.alura.polimorfism.models;

public class TimeCalculator {

    // Método polimórfico para calcular o tempo de qualquer tipo de Titulo (inclusive Serie)
    public static void calcularTempoExibicao(Title titulo) {
        System.out.println("Tempo total de exibição para " + titulo.getNome() + ": " + titulo.calcularTempo() + " minutos.");
    }
}
